package co.develhope.deploy1.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @Autowired
    private Environment environment;

    @GetMapping("/")
    public String mainEndpoint(){
       String var = environment.getProperty("myCustomEnvs.devName");
       return var;
    }

}
