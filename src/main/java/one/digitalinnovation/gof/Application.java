package one.digitalinnovation.gof;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * Projeto Spring Boot criado via Spring Initializr
 * Módulos fornecidos:
 * Spring Data JPA
 * Spring Web
 * H2 Database
 * OpenFeign
 */

@EnableFeignClients
@SpringBootApplication

public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
