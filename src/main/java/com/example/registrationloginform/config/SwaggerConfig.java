package com.example.registrationloginform.config;

import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {
    @Bean
    public OpenAPI customOpenAPI() {
        Contact contact = new Contact()
                .name("Your Name")
                .email("your.email@example.com");

        Info info = new Info()
                .title("User Registration API")
                .version("1.0")
                .description("API for user registration and login")
                .contact(contact);

        return new OpenAPI().info(info);
    }

}
