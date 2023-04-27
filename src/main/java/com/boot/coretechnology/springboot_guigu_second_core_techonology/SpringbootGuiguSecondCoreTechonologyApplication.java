package com.boot.coretechnology.springboot_guigu_second_core_techonology;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan({"com.boot.coretechnology.controller","com.boot.coretechnology.config"})
@SpringBootApplication
public class SpringbootGuiguSecondCoreTechonologyApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootGuiguSecondCoreTechonologyApplication.class, args);
    }

}
