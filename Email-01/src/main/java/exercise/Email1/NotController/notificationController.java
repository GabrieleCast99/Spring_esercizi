package exercise.Email1.NotController;

import exercise.Email1.Dto.NotificationDto;
import exercise.Email1.Email.Email;
import exercise.Email1.Entity.Student;
import exercise.Email1.Service.Student_service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
public class notificationController {

    @Autowired
    private Student_service studentService;

    @Autowired
    private Email email;

    @PostMapping("/notification")
    public ResponseEntity sendEmail(@PathVariable String id) {
        email.sendMail(id);
        try {
            Student studentSend = email.getStudentId(id);
            System.out.println("getting student notification " + studentSend);
            if (studentSend == null) {
                return (ResponseEntity) ResponseEntity.status(HttpStatus.BAD_REQUEST);
            }
            email.sendMail(studentSend.getId());
            return ResponseEntity.status(HttpStatus.OK).build();

        } catch (Exception e) {
            System.err.println("error "+e.getMessage());
            e.printStackTrace();
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(e.getMessage());

        }
    }
}
