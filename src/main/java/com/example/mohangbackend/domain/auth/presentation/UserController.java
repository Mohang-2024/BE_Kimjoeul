package com.example.mohangbackend.domain.auth.presentation;

import com.example.mohangbackend.domain.auth.presentation.dto.TokenResponse;
import com.example.mohangbackend.domain.auth.service.ReissueService;
import com.example.mohangbackend.domain.user.presentation.dto.SignInRequest;
import com.example.mohangbackend.domain.user.presentation.dto.SignUpRequest;
import com.example.mohangbackend.domain.user.service.UserSignInService;
import com.example.mohangbackend.domain.user.service.UserSignUpService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RequiredArgsConstructor
@RequestMapping("/users")
@RestController
public class UserController {

    private final UserSignInService userSignInService;
    private final UserSignUpService userSignUpService;
    private final ReissueService reissueService;

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping("/signup")
    public void signUp(@RequestBody @Valid SignUpRequest request) {
        userSignUpService.signup(request);
    }

    @ResponseStatus(HttpStatus.OK)
    @PostMapping("/signin")
    public TokenResponse signIn(@RequestBody @Valid SignInRequest request) {
        return userSignInService.signIn(request);
    }

    @ResponseStatus(HttpStatus.OK)
    @PostMapping("/reissue")
    public TokenResponse reissue(@RequestHeader(name = "AUTHORIZATION_HEADER")String refreshToken) {
        return reissueService.userReissue(refreshToken);
    }

}
