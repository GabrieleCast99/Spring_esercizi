package co.develhope.environmentvariables1.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

@Autowired
private Environment environment;

    @GetMapping("/home")
    public String getProperty(){
        String var = environment.getProperty("myCustomProps.devName");
        String var2 = environment.getProperty("myCustomProps.authCode");
        return var+" "+var2;
    }


}
