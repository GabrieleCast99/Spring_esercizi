package checkpoint_3.esame.ENTITY;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table
public class CarDocuments {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column
    private LocalDateTime dateTime;

    @ManyToOne
    private Customer customer;

    @ManyToOne
    private Car car;


    public CarDocuments() {
        this.id = id;
        this.dateTime = dateTime;
        this.customer = customer;
        this.car = car;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public void setDateTime(LocalDateTime dateTime) {
        this.dateTime = dateTime;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }
}
