package spring.exercise.First.API2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class FirstApi02Application {

	public static void main(String[] args) {
		SpringApplication.run(FirstApi02Application.class, args);
	}

}
