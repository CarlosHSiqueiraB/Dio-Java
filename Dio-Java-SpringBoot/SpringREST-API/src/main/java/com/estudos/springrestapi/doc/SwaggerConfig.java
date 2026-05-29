package com.estudos.springrestapi.doc;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {
    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI().info(new Info()
                .title("Spring REST API")
                .description("API de estudos com Spring Boot")
                .version("1.0.0").contact(new Contact()
                        .name("Carlos Henrique")
                        .url("https://www.youtube.com/watch?v=dQw4w9WgXcQ")));
    } // Esse tipo de brincadeira que me faz feliz
}
