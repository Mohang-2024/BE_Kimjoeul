package com.example.mohangbackend;

import com.example.mohangbackend.global.security.jwt.JwtProperty;
import com.example.mohangbackend.global.security.jwt.JwtTokenProvider;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.ConstructorBinding;
import org.springframework.boot.context.properties.EnableConfigurationProperties;


@EnableConfigurationProperties(JwtProperty.class)
@SpringBootApplication
@ConstructorBinding
public class MohangBackendApplication {

    public static void main(String[] args) {
        SpringApplication.run(MohangBackendApplication.class, args);
    }

}
