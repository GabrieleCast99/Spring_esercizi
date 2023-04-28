package Spring.Database.Mock.Database.Entity;

import jakarta.persistence.*;
import lombok.Data;

@Table
@Entity
@Data
public class Student {

    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    private int id;

    @Column
    private String firstName;

    @Column
    private String lastName;

    @Column(unique = true)
    private String email;


}
