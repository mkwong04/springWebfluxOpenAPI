package testm;

import org.springdoc.core.models.GroupedOpenApi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {

	/**
	 * 
	 * @return
	 */
	@Bean
	public GroupedOpenApi catalogApis() {
		String[] paths = {"/catalogues/**"};
		return GroupedOpenApi.builder()
				.group("Catalog")
				.pathsToMatch(paths)
				.build();
	}
	
	@Bean
	public GroupedOpenApi fishApis() {
		String[] paths = {"/fishes/**"};
		return GroupedOpenApi.builder()
				.group("Fish")
				.pathsToMatch(paths)
				.build();
	}
}
