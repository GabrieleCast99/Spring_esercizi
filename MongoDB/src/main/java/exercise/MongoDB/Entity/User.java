package exercise.MongoDB.Entity;

import org.springframework.data.annotation.Id;

public class User {

    @Id
    private int id;
    private String lastName;
    private String firstName;


}
