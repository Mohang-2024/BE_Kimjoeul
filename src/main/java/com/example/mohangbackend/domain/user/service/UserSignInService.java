package com.example.mohangbackend.domain.user.service;

import com.example.mohangbackend.domain.auth.exception.PasswordMisMatchException;
import com.example.mohangbackend.domain.auth.presentation.dto.TokenResponse;
import com.example.mohangbackend.domain.user.domain.User;
import com.example.mohangbackend.domain.user.domain.repository.UserRepository;
import com.example.mohangbackend.domain.user.exception.UserNotFoundException;
import com.example.mohangbackend.domain.user.presentation.dto.SignInRequest;
import com.example.mohangbackend.global.security.jwt.JwtTokenProvider;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@RequiredArgsConstructor
@Service
public class UserSignInService {

    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;
    private final JwtTokenProvider jwtTokenProvider;

    @Transactional
    public TokenResponse signIn(SignInRequest request) {
        User user = userRepository.findByAccountId(request.getAccountId())
                .orElseThrow(()-> UserNotFoundException.EXCEPTION);

        if(!passwordEncoder.matches(request.getPassword(), user.getPassword())) {
            throw PasswordMisMatchException.EXCEPTION;
        }

        String accessToken = jwtTokenProvider.generateAccessToken(request.getAccountId());
        String refreshToken = jwtTokenProvider.generateRefreshToken(request.getAccountId());

        return TokenResponse.builder()
                .accessToken(accessToken)
                .refreshToken(refreshToken)
                .build();
    }
}
