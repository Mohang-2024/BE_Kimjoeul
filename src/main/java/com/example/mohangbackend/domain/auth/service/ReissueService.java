package com.example.mohangbackend.domain.auth.service;

import com.example.mohangbackend.domain.auth.domain.RefreshToken;
import com.example.mohangbackend.domain.auth.domain.repository.RefreshTokenRepository;
import com.example.mohangbackend.domain.auth.exception.InvalidRefreshTokenException;
import com.example.mohangbackend.domain.auth.exception.RefreshTokenNotFoundException;
import com.example.mohangbackend.domain.auth.presentation.dto.TokenResponse;
import com.example.mohangbackend.global.security.jwt.JwtProperty;
import com.example.mohangbackend.global.security.jwt.JwtTokenProvider;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@RequiredArgsConstructor
@Service
public class ReissueService {

    private final JwtProperty jwtProperty;
    private final RefreshTokenRepository refreshTokenRepository;
    private final JwtTokenProvider jwtTokenProvider;

    @Transactional
    public TokenResponse userReissue(String refreshToken) {
        String parseToken = jwtTokenProvider.parseToken(refreshToken);
        if(parseToken == null) {
            throw InvalidRefreshTokenException.EXCEPTION;
        }

        RefreshToken redisRefreshToken = refreshTokenRepository.findByRefreshToken(parseToken)
                .orElseThrow(()-> RefreshTokenNotFoundException.EXCEPTION);

        String newRefreshToken = jwtTokenProvider.generateRefreshToken(redisRefreshToken.getAccountId());
        redisRefreshToken.updateToken(newRefreshToken, jwtProperty.getRefreshExp());

        String newAccessToken = jwtTokenProvider.generateAccessToken(redisRefreshToken.getAccountId());

        return TokenResponse.builder()
                .accessToken(newAccessToken)
                .refreshToken(parseToken)
                .build();
    }
}
