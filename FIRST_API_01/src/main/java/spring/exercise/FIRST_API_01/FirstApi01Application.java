package spring.exercise.FIRST_API_01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class FirstApi01Application {

	public static void main(String[] args) {
		SpringApplication.run(FirstApi01Application.class, args);
	}

}
