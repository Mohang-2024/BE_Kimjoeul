package com.example.mohangbackend.domain.auth.domain;


import jakarta.persistence.Id;

import lombok.*;
import org.springframework.data.redis.core.RedisHash;
import org.springframework.data.redis.core.TimeToLive;

@Getter
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Builder
@RedisHash(value = "refresh_token", timeToLive = 7200)
public class RefreshToken {

    @Id
    private String accountId;

    private String refreshToken;

    private Long ttl;

    public void updateToken(String refreshToken, Long ttl) {
        this.refreshToken = refreshToken;
        this.ttl = ttl;
    }

}
