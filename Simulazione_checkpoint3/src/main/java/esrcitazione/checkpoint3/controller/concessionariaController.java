package esrcitazione.checkpoint3.controller;

import esrcitazione.checkpoint3.ENTITY.Auto;
import esrcitazione.checkpoint3.ENTITY.Concessionaria;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/conc")
public class concessionariaController {

    @Autowired
    private Concessionaria concessionaria;

    @GetMapping("/welcome")
     public String getWelcome(){
        return "Welcome to my website";
    }

   /* @GetMapping
    public Auto getCar() {
        Auto car = new Auto();
        car.setId(1);
        car.setModello("Fiat");
        car.setCilindrata(1000.0);
        car.setMarchio("fiatt");
        car.setTarga("aoenebn");
        return car;
    }*/

    @Autowired
    private Auto auto;
    @Autowired
    private List<Auto> autoList;

    @GetMapping("/getauto/{idAuto}")
    public Auto getAuto(@PathVariable int idAuto) {
        for (Auto auto : autoList) {
            if (auto.getId()==idAuto) {
                return auto;
            }
        }
        throw new IllegalArgumentException("Auto con ID " + idAuto + " non trovata");
    }
}
