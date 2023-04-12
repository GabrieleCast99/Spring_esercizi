package spring.exercise.FIRST_API_01.CONTROLLER;

import org.springframework.web.bind.annotation.*;

@RestController
public class NameController {

    //inserire il nome su postman
    @GetMapping(value = "/name")
    public String getName(@RequestParam String name){
        return "Ciao io sono "+ name;
    }

    @PostMapping(value = "/name/{reversName}" )
    public String reversName(@PathVariable String reversName){

        StringBuilder str = new StringBuilder(reversName);
        StringBuilder strReverse= str.reverse();


        return "Il mio nome al contrario è: "+strReverse;
    }
}
