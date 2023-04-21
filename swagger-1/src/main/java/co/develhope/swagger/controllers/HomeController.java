package co.develhope.swagger.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/home")
    public String getHome(){
        return "welcome to the demo API";
    }


}
