package com.example.mohangbackend.domain.user.service;

import com.example.mohangbackend.domain.user.domain.User;
import com.example.mohangbackend.domain.user.domain.repository.UserRepository;
import com.example.mohangbackend.domain.user.exception.UserAlreadyExitsException;
import com.example.mohangbackend.domain.user.presentation.dto.SignUpRequest;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@RequiredArgsConstructor
@Getter
@Service
public class UserSignUpService {

    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;

    @Transactional
    public void signup(SignUpRequest request) {
        if(userRepository.existsByAccountId(request.getAccountId())) {
            throw UserAlreadyExitsException.EXCEPTION;
        }

        System.out.printf(request.getAccountId(), request.getPhoneNumber(), request.getAge());
         userRepository.save(User.builder()
                .accountId(request.getAccountId())
                .password(passwordEncoder.encode(request.getPassword()))
                .phoneNumber(request.getPhoneNumber())
                .age(request.getAge())
                .build());
    }
}
