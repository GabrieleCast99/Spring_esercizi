package spring.esercizi.Hybernate.ENTITY;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@Table
@Data
@NoArgsConstructor
public class enrollments {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @ManyToOne
    private Classes classes;

    @ManyToOne
    private Student student;

}
