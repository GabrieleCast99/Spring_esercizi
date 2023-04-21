package esrcitazione.checkpoint3.ENTITY;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;


import java.util.List;


@Entity
@Table
@Data
@NoArgsConstructor
@AllArgsConstructor
@Component
public class Concessionaria {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(nullable = false)
    private String indirizzo;

    @OneToMany
    private List<Auto> autoList;
}
