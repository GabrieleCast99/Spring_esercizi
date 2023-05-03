package exercise.Interceptor.Middleware2.Controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class BasicController {

    @GetMapping
    private String welcome(){
        return "welcomes ";
    }

}
