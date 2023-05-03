package exercise.Interceptor.Middleware1.Controller;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;


@RestController
@RequestMapping("/time")
public class BasicController {

    @GetMapping
    private LocalDateTime localDateTime(){

        LocalDateTime localDateTime= LocalDateTime.now();
        return localDateTime;
    }

}
