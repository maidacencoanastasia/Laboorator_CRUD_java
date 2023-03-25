package com.example.backend;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@OpenAPIDefinition(info = @Info(title = "CRUD REST API", version = "1.0", description = "CRUD REST API"))
public class LaboratorCrudApplication {

    public static void main(String[] args) {
        SpringApplication.run(LaboratorCrudApplication.class, args);
        System.out.println("Elaborated by Maidacenco IS31Z");
    }

}
