package esrcitazione.checkpoint3.ENTITY;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Check;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;



@Entity
@Table
@Data
@NoArgsConstructor
@AllArgsConstructor
@Component
public class Auto {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(nullable = false)
    private String marchio;
    @Column(nullable = false)
    private String modello;

    @Column(unique = true,nullable = false)
    private String targa;

    @Check(constraints = "cilindrata>0")
    private double cilindrata;

}
