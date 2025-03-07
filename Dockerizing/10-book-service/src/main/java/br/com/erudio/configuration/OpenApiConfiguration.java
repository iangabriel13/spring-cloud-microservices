package br.com.erudio.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.OpenAPI;

@Configuration
@OpenAPIDefinition(info =
        @Info(title = "Book Service API",
                version = "v1",
                description = "Documentation of Book Service API"))
public class OpenApiConfiguration {
	
	@Bean
	OpenAPI customOpenAPI() {
		return new OpenAPI()
			.components(new Components())
			.info(
				new io.swagger.v3.oas.models.info.Info()
				.title("Book Service API")
                .version("1.0")
                .description("Documentation of Book Service API"));
	}
}