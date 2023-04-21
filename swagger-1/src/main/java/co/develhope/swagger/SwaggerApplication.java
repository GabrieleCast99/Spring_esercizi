package co.develhope.swagger;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SwaggerApplication {

    public static void main(String[] args) {
        SpringApplication.run(SwaggerApplication.class, args);
    }
 // write this to run in port = 1234 "mvn spring-boot:run -Dspring-boot.run.arguments=--server.port=1234"
}
