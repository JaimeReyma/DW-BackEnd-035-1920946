package com.backend.app.microfono.config;

import java.util.Collections;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {

    @Bean
    Docket apiDocket() {
		return new Docket(DocumentationType.SWAGGER_2)
				.select()
				.apis(RequestHandlerSelectors.basePackage("com.backend.app.microfonoo.controllers"))
				.paths(PathSelectors.any())
				.build()
				.apiInfo(getApiinfo());
		
	}

	private ApiInfo getApiinfo() {
		return new ApiInfo(
				"Microfono",
				"Servicio para creacion de Microfono",
				"1.0.0",
				"Terminos de Servicios",
				new Contact("Jaime", "https://www.google.com", "jimmyraya48@gmail.com"),
				"LICENSE",
				"LICENSE URL",
				Collections.emptyList()
				);
		
	}

}


