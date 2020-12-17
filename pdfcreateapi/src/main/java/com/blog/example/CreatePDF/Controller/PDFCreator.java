package com.blog.example.CreatePDF.Controller;


import com.blog.example.CreatePDF.Configuration.PDFThymeleafConfiguration;
import com.blog.example.CreatePDF.dto.Book;
import com.blog.example.CreatePDF.helper.ContextHelper;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.itextpdf.text.DocumentException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;
import org.thymeleaf.context.Context;
import org.thymeleaf.spring4.SpringTemplateEngine;
import org.thymeleaf.templateresolver.ClassLoaderTemplateResolver;
import org.w3c.tidy.Tidy;
import org.xhtmlrenderer.pdf.ITextRenderer;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.FileSystems;
import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.TimeZone;
import javax.mail.MessagingException;

import static com.itextpdf.text.pdf.BaseFont.EMBEDDED;
import static com.itextpdf.text.pdf.BaseFont.IDENTITY_H;


@RestController
@JsonFormat(shape= JsonFormat.Shape.ARRAY)
public class PDFCreator {


    @Autowired
    private SpringTemplateEngine templateEngine;

    @RequestMapping(value = "/createpdf", method = RequestMethod.POST)
    public byte[] update(@RequestBody ArrayList<Book> newdetails) throws IOException, DocumentException, MessagingException, ParseException {

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