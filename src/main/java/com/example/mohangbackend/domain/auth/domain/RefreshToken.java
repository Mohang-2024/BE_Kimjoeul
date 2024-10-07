package com.example.mohangbackend.domain.auth.domain;



import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;


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

    private Long ttl;

    public void updateToken(String refreshToken, Long ttl) {
        this.refreshToken = refreshToken;
        this.ttl = ttl;
    }

}
