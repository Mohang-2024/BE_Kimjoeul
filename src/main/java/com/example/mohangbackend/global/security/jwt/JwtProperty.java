package com.example.mohangbackend.global.security.jwt;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.bind.ConstructorBinding;

@Getter
@AllArgsConstructor
@ConfigurationProperties(prefix = "jwt", ignoreInvalidFields = false)
public class JwtProperty {

    private final String secretKey;
    private final Long accessExp;
    private final Long refreshExp;
    private final String header;
    private final String prefix;

}
