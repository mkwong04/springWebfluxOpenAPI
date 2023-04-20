package testm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;

/**
 * 
 * Spring boot application main
 */
@SpringBootApplication
@OpenAPIDefinition(info = @Info(title = "APIs", version = "1.0", description = "Service API v1.0"))
public class Application {
	/**
	 * @param args 
	 */
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}
