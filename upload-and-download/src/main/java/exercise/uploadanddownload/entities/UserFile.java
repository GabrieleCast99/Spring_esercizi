package exercise.uploadanddownload.entities;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(indexes= {
        @Index(unique = true, name = "email_idx",columnList =  "email")
})
public class UserFile {

     @Id
     @GeneratedValue(strategy = GenerationType.SEQUENCE)
     private int id;


     private String firstName;

     private String lastName;
    @Column(unique = true)
    private String email;
    private String profilePicture;


}
