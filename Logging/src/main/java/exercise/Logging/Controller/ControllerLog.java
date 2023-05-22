package exercise.Logging.Controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class ControllerLog {
    Logger logger = LoggerFactory.getLogger(ControllerLog.class);

    @GetMapping("/")
    public void getWelcome() {
        logger.info("Welcome");
    }

    @GetMapping("/exp")
    public String calculateExponent() {
        String value1Env = System.getenv("VALUE1");
        String value2Env = System.getenv("VALUE2");
        int value1 = (value1Env != null) ? Integer.parseInt(value1Env) : 2;
        int value2 = (value2Env != null) ? Integer.parseInt(value2Env) : 8;
        System.out.println("[DEBUG] Exponent calculation started");
        int result = (int) Math.pow(value1, value2);
        System.out.println("[DEBUG] Exponent calculation completed");
        return "Exponent: " + result;
    }

    @GetMapping("/get-errors")
    public String generateError() {
        logger.error("Custom error generated");
        throw new CustomErrorException("Custom error");
    }
}



