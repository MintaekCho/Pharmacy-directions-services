package com.example.fastproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class FastProjectApplication {

    public static void main(String[] args) {
        SpringApplication.run(FastProjectApplication.class, args);
    }

}
