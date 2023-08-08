package com.hackaton.interbank;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication(scanBasePackages = "com.hackaton.interbank")
@RestController
@EntityScan(basePackages = "com.hackaton.interbank.Entity")
@EnableJpaRepositories(basePackages = "com.hackaton.interbank.Repository")
public class InterbankApplication {

    public static void main(String[] args) {
        SpringApplication.run(InterbankApplication.class, args);
    }

    @GetMapping("/hello")
    public String hello(@RequestParam(value = "name", defaultValue = "World") String name) {
        return String.format("Hello %s!", name);
    }
}
