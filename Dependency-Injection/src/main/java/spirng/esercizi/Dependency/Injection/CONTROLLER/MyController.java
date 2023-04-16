package spirng.esercizi.Dependency.Injection.CONTROLLER;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import spirng.esercizi.Dependency.Injection.SERVICE.MyService;

@RestController
public class MyController {
    private MyService myService;
    private static final Logger logger= LoggerFactory.getLogger(MyController.class);


    @Autowired
    public MyController(MyService myService) {
        logger.info("constructor controller");
        this.myService = myService;

    }

    @GetMapping("/")
    public String Welcome(){
        logger.info("welcome method called");
        return "Welcome to my application";
    }

    @GetMapping("/getName")
    public String serviceName(){
        logger.info("serviceName method called");

        return myService.getName();
    }


}
