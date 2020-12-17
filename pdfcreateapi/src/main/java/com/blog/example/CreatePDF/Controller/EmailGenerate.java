package com.blog.example.CreatePDF.Controller;


import com.sun.mail.smtp.SMTPTransport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.*;

import javax.activation.DataHandler;
import javax.activation.FileDataSource;
import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
import java.io.UnsupportedEncodingException;
import java.util.Properties;


@RestController
public class EmailGenerate {

    @Autowired
    private Environment env;

    @RequestMapping("/sendMail")
    public void sendMail(@RequestBody String path) throws MessagingException {

        Properties prop = System.getProperties();
        prop.put("mail.smtp.auth", "true");
        prop.put("mail.smtp.starttls.enable", "true");
        prop.put("mail.smtp.starttls.required", "true");


        Session session = Session.getInstance(prop, null);
        Message msg = new MimeMessage(session);
        String emailto;
        try {
            msg.setFrom(new InternetAddress("avneet19862000@gmail.com","GMS"));
            if(env.getProperty("EMAIL_TO")==null){
                emailto="asingh@gms.ca";
            }else{
                emailto=env.getProperty("EMAIL_TO");
            }
            msg.setRecipients(Message.RecipientType.TO,
                    InternetAddress.parse(emailto, false));
            msg.setSubject("Thank You");

            // text
            MimeBodyPart p1 = new MimeBodyPart();
            p1.setText(" docker cp <container ID>:"+path);

            // file
            MimeBodyPart p2 = new MimeBodyPart();
            FileDataSource fds = new FileDataSource(path);
            p2.setDataHandler(new DataHandler(fds));
            p2.setFileName(fds.getName());

            Multipart mp = new MimeMultipart();
            mp.addBodyPart(p1);
            mp.addBodyPart(p2);

            msg.setContent(mp);


            SMTPTransport t = (SMTPTransport) session.getTransport("smtp");

            // connect
            t.connect("smtp.googlemail.com", "avneet19862000@gmail.com", "yejeafcvmwphgtui");

            // send
            t.sendMessage(msg, msg.getAllRecipients());

            System.out.println("Response: " + t.getLastServerResponse());

            t.close();

        } catch (MessagingException e) {
            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
    }


//            attachPart.attachFile("src//EOBs/2020/26/Lokesh4.pdf");

}
