package spring.esercizi.First.API3.CONTROLLER;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StringController {

    //esercizio sulla concatenazione di 2 stringhe, la prima obbligatoria la seconda opzionale
    @GetMapping("/strings")
    public String c2s(@RequestParam(required = true) String firstString,@RequestParam(required = false) String secondString){
        return "Questa è la prima stringa: "+firstString+". Questa ,se esiste,è la seconda stringa: "+secondString;
    }
}
