package spirng.esercizi.Dependency.Injection.SERVICE;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;
import spirng.esercizi.Dependency.Injection.COMPONENT.MyComponent;

@Service
public class MyService {
    private MyComponent MyComponent;
    private static final Logger logger= LoggerFactory.getLogger(MyService.class);


    @Autowired
    public MyService(MyComponent myComponent){
        logger.info("constructor service");
        this.MyComponent=myComponent;
    }
    @Bean
    public String getName(){
        logger.info("getName was called");
        return MyComponent.getMyComponentName();
    }
}
