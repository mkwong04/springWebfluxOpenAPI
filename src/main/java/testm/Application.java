package testm;

import org.springdoc.core.models.GroupedOpenApi;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

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
	
	/**
	 * 
	 * @return
	 */
	@Bean
	public GroupedOpenApi serviceApi() {
		String[] paths = {"/services/**"};
		return GroupedOpenApi.builder()
				.group("service")
				.pathsToMatch(paths)
				.build();
	}
}
