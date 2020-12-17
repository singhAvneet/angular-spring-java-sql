package api.mssql.demo.controller;



import api.mssql.demo.Model.Book;
import api.mssql.demo.helper.ContextHelper;
import com.fasterxml.jackson.annotation.JsonFormat;

import com.itextpdf.text.DocumentException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.thymeleaf.context.Context;
import org.thymeleaf.spring4.SpringTemplateEngine;
import org.w3c.tidy.Tidy;
import org.xhtmlrenderer.pdf.ITextRenderer;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;
import java.nio.file.FileSystems;
import java.text.ParseException;
import java.util.ArrayList;


@RestController
@JsonFormat(shape= JsonFormat.Shape.ARRAY)
public class PDFCreator {


    @Autowired
    private SpringTemplateEngine templateEngine;

    @RequestMapping(value = "/createpdf", method = RequestMethod.POST)
    public byte[] update(@RequestBody ArrayList<Book> newdetails) throws IOException, DocumentException,  ParseException {

        ContextHelper contextHelper=new ContextHelper();
        Context context=contextHelper.getContext(newdetails);



        String htmlContentToRender = templateEngine.process("summaryTemplate", context);

        String xHtml = xhtmlConvert(htmlContentToRender);
        String baseUrl = FileSystems
                .getDefault()
                .getPath("src", "main", "resources","summaryTemplate")
                .toUri()
                .toURL()
                .toString();
        ITextRenderer renderer = new ITextRenderer();

        renderer.setDocumentFromString(xHtml, baseUrl);
        renderer.layout();

        ByteArrayOutputStream obj=new ByteArrayOutputStream();
        renderer.createPDF(obj);

        return obj.toByteArray();

    }





    private String xhtmlConvert(String html) throws UnsupportedEncodingException {
        Tidy tidy = new Tidy();
        tidy.setInputEncoding("UTF-8");
        tidy.setOutputEncoding("UTF-8");
        tidy.setXHTML(true);
        ByteArrayInputStream inputStream = new ByteArrayInputStream(html.getBytes(StandardCharsets.UTF_8));
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        tidy.parseDOM(inputStream, outputStream);
        return outputStream.toString(StandardCharsets.UTF_8);
    }



}


//Ref: https://github.com/ChinthakaJ98/PDF-Create.git