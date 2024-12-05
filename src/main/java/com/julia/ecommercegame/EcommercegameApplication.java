package com.julia.ecommercegame;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan(basePackages = "com.julia.ecommercegame.model")
public class EcommercegameApplication {

    public static void main(String[] args) {
        SpringApplication.run(EcommercegameApplication.class, args);
    }

}
