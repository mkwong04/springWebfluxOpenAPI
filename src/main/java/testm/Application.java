package testm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;

/**
 * 
 * Spring boot application main
 */
@SpringBootApplication
@OpenAPIDefinition
public class Application {
	/**
	 * @param args 
	 */
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
	

}
