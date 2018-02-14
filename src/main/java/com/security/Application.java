package com.security;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.security.SecurityAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.bind.annotation.CrossOrigin;

@SpringBootApplication(exclude = {SecurityAutoConfiguration.class}, scanBasePackages = "com.security")
@EnableAutoConfiguration
@ComponentScan
@EnableTransactionManagement
@EntityScan(basePackages = "com/security/domain")
@EnableJpaRepositories(basePackages = "com.security.repository")
@CrossOrigin(origins = {"http://localhost:8000", "null"})
public class Application {

    public static void main(String[] args) throws Exception
    {
        SpringApplication.run(Application.class, "--debug");
    }
}
