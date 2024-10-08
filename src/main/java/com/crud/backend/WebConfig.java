package com.crud.backend;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {

	@Override
	public void addCorsMappings(CorsRegistry registry) {
		registry.addMapping("/**") // Aplica para todos os endpoints
				.allowedOrigins("http://localhost:3000") // Permite a origem do seu front-end
				.allowedMethods("GET", "POST", "PUT", "DELETE") // Métodos HTTP permitidos
				.allowedHeaders("*"); // Cabeçalhos permitidos
	}
}
