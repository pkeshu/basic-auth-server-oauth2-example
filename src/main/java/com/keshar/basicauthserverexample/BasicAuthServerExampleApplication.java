package com.keshar.basicauthserverexample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer;

@SpringBootApplication
@EnableAuthorizationServer
public class BasicAuthServerExampleApplication {

    public static void main(String[] args) {
        SpringApplication.run(BasicAuthServerExampleApplication.class, args);
    }

}
