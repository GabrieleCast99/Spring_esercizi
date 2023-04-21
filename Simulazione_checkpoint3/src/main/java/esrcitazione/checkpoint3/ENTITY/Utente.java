package esrcitazione.checkpoint3.ENTITY;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Table
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Utente {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
private int id;

@Column(nullable = false)
private String name;
@Column(nullable = false)
private String congome;

@Column(unique = true,nullable = false)
private String email;
}
