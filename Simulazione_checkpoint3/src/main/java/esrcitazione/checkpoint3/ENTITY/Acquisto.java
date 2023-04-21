package esrcitazione.checkpoint3.ENTITY;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;


@Entity
@Table
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Acquisto {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column()
    private LocalDateTime timeStamp;
    @ManyToOne
    private Auto auto;

    @ManyToOne
    private Utente utente;
}
