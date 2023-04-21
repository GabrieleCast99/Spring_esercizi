package esrcitazione.checkpoint3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories("esrcitazione.checkpoint3.Repo")
public class Checkpoint3Application {

	public static void main(String[] args) {
		SpringApplication.run(Checkpoint3Application.class, args);
	}

}
