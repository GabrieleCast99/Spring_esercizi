package spring.esercizi.Hybernate.ENTITY;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table
@Data
@NoArgsConstructor
@AllArgsConstructor
public class user {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO )
    private int id;

    private String name;
    private String surname;
    private String city;
    private int age;

}
