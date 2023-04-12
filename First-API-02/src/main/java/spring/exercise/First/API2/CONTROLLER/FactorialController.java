package spring.exercise.First.API2.CONTROLLER;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FactorialController {

    @GetMapping(value = "/factorial")
    public int getFactorial(@RequestParam int n){

        if(n<0){
            throw new IllegalArgumentException("il numero non può essere negativo");
        }
        int result=1;

        for(int i=2;i<=n;i++){
            result *=i;
        }


        return result;
    }

}
