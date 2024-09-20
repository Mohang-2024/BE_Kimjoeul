package com.example.mohangbackend.domain.auth.domain;


import lombok.*;
import org.springframework.data.redis.core.TimeToLive;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Getter
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Builder
@Entity(name = "tbl_refresh_token")
public class RefreshToken {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String accountId;

    private String refreshToken;

    @TimeToLive
    private Long ttl;

    public void updateToken(String refreshToken, Long ttl) {
        this.refreshToken = refreshToken;
        this.ttl = ttl;
    }

}
