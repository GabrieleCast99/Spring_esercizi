package exercise.Email1.Email;

import com.sendgrid.*;
import com.sendgrid.helpers.mail.Mail;
import com.sendgrid.helpers.mail.objects.Content;
import exercise.Email1.Dto.NotificationDto;
import exercise.Email1.Entity.Student;
import exercise.Email1.Service.Student_service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;


import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Component
public class Email {

    @Autowired
    private SendGridAPI sendGridAPI;

    public Student getStudentId(String studentId) {
        Optional<Student> studentFromList = student.stream().filter(student -> student.getId().equals(studentId)).findAny();
        return studentFromList.isPresent() ? studentFromList.get() : null;
    }
    List<Student> student= new ArrayList<>();{
        student.add(new Student("1","Gabriele","castiglione","gabriele.castiglione@libero.it"));
        student.add(new Student("2","samue","casti","samu.casti@example.it"));
        student.add(new Student("3","Mario","Rossi","mario.rossi@example.com"));
        student.add(new Student("4","Luigi","Verdi","luigi.verdi@example.com"));

    }

    public void sendMail(String id) {
        Student stud = getStudentId(id);
        NotificationDto nDTO = new NotificationDto();
        nDTO.setText("mail content");
        nDTO.setTitle("mail subject");
        nDTO.setStudentId(id);
        Email from = new Email("gabriele.castiglione@libero.it");
        String subject = nDTO.getTitle();
        Email to = new Email(stud.getEmail());
        Content content = new Content("text/plain", nDTO.getText());
        Mail mail = new Mail(from, subject, to, content);
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



