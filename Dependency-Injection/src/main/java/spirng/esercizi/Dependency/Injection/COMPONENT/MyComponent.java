package spirng.esercizi.Dependency.Injection.COMPONENT;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class MyComponent {
    private String myComponentName;
    private static final Logger logger= LoggerFactory.getLogger(MyComponent.class);


    public MyComponent( ) {
        logger.info("Component Constructor");
        this.myComponentName = "My name is Gabriele";
    }

    @Bean
    public String getMyComponentName() {
        logger.info("getMyComponentName was called");
        return myComponentName;
    }
}
