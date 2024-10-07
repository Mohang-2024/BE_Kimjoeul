package com.example.mohangbackend.global.config;

import com.example.mohangbackend.global.exception.ExceptionFilter;
import com.example.mohangbackend.global.security.jwt.JwtTokenFilter;
import com.example.mohangbackend.global.security.jwt.JwtTokenProvider;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.security.config.annotation.SecurityConfigurerAdapter;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.DefaultSecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class FilterConfig extends SecurityConfigurerAdapter<DefaultSecurityFilterChain, HttpSecurity> {

    private final ObjectMapper objectMapper;
    private final JwtTokenProvider jwtTokenProvider;


    @Override
    public void configure(HttpSecurity builder) {
        builder.addFilterBefore(new JwtTokenFilter(jwtTokenProvider), UsernamePasswordAuthenticationFilter.class);
        builder.addFilterBefore(new ExceptionFilter(objectMapper), JwtTokenFilter.class);
    }

}
