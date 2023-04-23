package simulazione.Checkpoint3.ENTITY;

import jakarta.persistence.*;

@Entity
@Table
public class Subscription {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @ManyToOne
    private Account account;

    @ManyToOne
    private Newsletter newsletter;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public Newsletter getNewsletter() {
        return newsletter;
    }

    public void setNewsletter(Newsletter newsletter) {
        this.newsletter = newsletter;
    }


    public Subscription() {
        this.id = id;
        this.account = account;
        this.newsletter = newsletter;
    }
}
