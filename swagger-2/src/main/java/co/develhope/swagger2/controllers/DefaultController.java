package co.develhope.swagger2.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DefaultController {

    @GetMapping()
    public String welcome(){
        return "Hii this is my swagger welcome";
    }

}