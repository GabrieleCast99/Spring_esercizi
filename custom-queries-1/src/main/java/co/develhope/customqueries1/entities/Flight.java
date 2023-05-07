package co.develhope.customqueries1.entities;


import jdk.jfr.Enabled;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import javax.persistence.*;

@Entity
@Data
@Table
@NoArgsConstructor
@AllArgsConstructor
public class Flight {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column
    private String description;

    @Column
    private String fromAirport;
    @Column
    private String toAirport;
    @Column
    @Enumerated(EnumType.STRING)
    private FlightStatus status;
}
