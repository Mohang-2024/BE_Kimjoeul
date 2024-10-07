package com.example.mohangbackend;

import com.example.mohangbackend.global.security.jwt.JwtProperty;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.boot.context.properties.EnableConfigurationProperties;



@EnableConfigurationProperties(JwtProperty.class)
@SpringBootApplication
public class MohangBackendApplication {

    public static void main(String[] args) {
        SpringApplication.run(MohangBackendApplication.class, args);
    }

}
