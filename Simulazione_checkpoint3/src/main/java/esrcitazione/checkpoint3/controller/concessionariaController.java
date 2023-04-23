package esrcitazione.checkpoint3.controller;

import esrcitazione.checkpoint3.ENTITY.Auto;
import esrcitazione.checkpoint3.ENTITY.Concessionaria;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping("/getauto/{idAuto}")
    public Auto getAuto(@PathVariable int idAuto) {

        Auto auto1= new Auto();
        auto1.setId(0);
        auto1.setTarga("Ax123ZY");
        auto1.setCilindrata(200);
        auto1.setModello("panda");
        auto1.setMarchio("fiat");
        autoList.add(auto1);



        Auto auto2= new Auto();
        auto2.setId(1);
        auto2.setTarga("Cx123ZY");
        auto2.setCilindrata(300);
        auto2.setModello("q3");
        auto2.setMarchio("audi");
        autoList.add(auto2);




        for (Auto auto : autoList) {
            if (auto.getId()==idAuto) {
            }




            return auto;
        }

        throw new IllegalArgumentException("Auto con ID " + idAuto + " non trovata");
    }
}
