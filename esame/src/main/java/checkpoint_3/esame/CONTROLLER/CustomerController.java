package checkpoint_3.esame.CONTROLLER;

import checkpoint_3.esame.ENTITY.Car;
import checkpoint_3.esame.ENTITY.Customer;
import org.springframework.web.bind.annotation.*;

@RestController
public class CustomerController {

    @PostMapping("/register/{nome},{cognome}")
    public Customer customer(@PathVariable String nome,@PathVariable String cognome){
        if(nome.matches(" ") || cognome.matches(" ")){
            throw new IllegalArgumentException("Spazio non accettato");
        }

        nome=nome.substring(0,1).toUpperCase()+ nome.substring(1);
        cognome=cognome.substring(0,1).toUpperCase()+ cognome.substring(1);


        Customer customer=new Customer();
        customer.setNome(nome);
        customer.setCognome(cognome);

        return customer;
    }


    @GetMapping("/model")
    public Car getCar(@RequestHeader(value = "XCarModel") String XCarModel){

        Car car1= new Car();
        car1.setModello(XCarModel);

        return car1;

    }
}
