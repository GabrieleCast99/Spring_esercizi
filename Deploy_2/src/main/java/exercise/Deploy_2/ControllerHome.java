package exercise.Deploy_2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@RestController
public class ControllerHome {

    @GetMapping("/sum")
    public Integer getSum(){
    Random random=new Random();
    int sum1= random.nextInt(100);
    int sum2= random.nextInt(100);
        return sum1+sum2;
    }


}
