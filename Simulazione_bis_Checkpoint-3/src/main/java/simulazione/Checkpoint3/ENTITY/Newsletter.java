package simulazione.Checkpoint3.ENTITY;


import jakarta.persistence.*;

@Table
@Entity
public class Newsletter {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column
    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Newsletter(int id, String name) {
        this.id = id;
        this.name = name;
    }
}
