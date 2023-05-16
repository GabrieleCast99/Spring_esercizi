package exercise.Email1.Email;

import com.sendgrid.*;
import com.sendgrid.helpers.mail.Mail;
import com.sendgrid.helpers.mail.objects.Content;
import exercise.Email1.Dto.NotificationDto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;


import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.sendgrid.Method;
import com.sendgrid.Request;
import com.sendgrid.Response;
import com.sendgrid.SendGridAPI;
import com.sendgrid.helpers.mail.Mail;
import com.sendgrid.helpers.mail.objects.Content;
import com.sendgrid.helpers.mail.objects.Email;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;



@Service
public class SendGridMailer {

    @Autowired
    private SendGridAPI sendGridAPI;

    public void sendMailWithHtml(String text) {

        NotificationDto nDTO = new NotificationDto();
        nDTO.setText(text);
        nDTO.setTitle("Title of mail with html inside");

        Email from = new Email("gabriele.castiglione@libero.it", "MailSender");
        String subject = nDTO.getTitle();
        Email to = new Email("gabriele.castiglione@libero.it");
        Content htmlContent = new Content("text/html", "<h1>Hello World!</h1>" +
                "<h2>You have a new message: </h2>" +
                "<img src='https://www.google.com/images/branding/googlelogo/1x/googlelogo_color_272x92dp.png' alt='Alternative text' height='200'>" +
                "<h3>" + nDTO.getText() + "</h3>");
        Mail mail = new Mail(from, subject, to, htmlContent);
        Request request = new Request();

        try {
            request.setMethod(Method.POST);
            request.setEndpoint("mail/send");
            request.setBody(mail.build());
            Response response = sendGridAPI.api(request);
            System.out.println(response.getBody());
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
