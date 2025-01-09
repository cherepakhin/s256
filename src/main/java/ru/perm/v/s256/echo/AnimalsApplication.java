package ru.perm.v.s256.echo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication
@EnableWebMvc // Need for OpenApiDoc
public class AnimalsApplication {

    public static void main(String[] args) {
        SpringApplication.run(AnimalsApplication.class, args);
    }

}
