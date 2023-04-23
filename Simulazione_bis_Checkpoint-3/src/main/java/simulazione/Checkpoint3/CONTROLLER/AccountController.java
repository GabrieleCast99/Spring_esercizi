package simulazione.Checkpoint3.CONTROLLER;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import simulazione.Checkpoint3.ENTITY.Account;
import simulazione.Checkpoint3.ENTITY.Newsletter;
import simulazione.Checkpoint3.ENTITY.Subscription;

@RestController
public class AccountController {

    private Subscription subscription;

    @PostMapping("/register")
    public Account getAccount(@RequestParam String name,@RequestParam String surname){
        //validazione nome e cognome
        if(!name.matches("[a-zA-Z]+")  || !surname.matches("[a-zA-Z]+")    ){
            throw new IllegalArgumentException("caratteri non accettati");
        }



        name = name.substring(0, 1).toUpperCase() + name.substring(1);
        surname = surname.substring(0, 1).toUpperCase() + surname.substring(1);

        Account account= new Account();
        account.setName(name);
        account.setSurname(surname);


            return account;


    }

    @PostMapping("/subscribe")
    public Subscription getSubscribe(@RequestParam Newsletter id, @RequestHeader Account XAccountId){
        Subscription subscription1= new Subscription();
        subscription1.setAccount(XAccountId);
        subscription1.setNewsletter(id);

        return subscription1;
    }



}
