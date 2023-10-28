package com.jwt.fathi.demo.service;

import com.jwt.fathi.demo.dao.request.SignInRequest;
import com.jwt.fathi.demo.dao.request.SignUpRequest;
import com.jwt.fathi.demo.dao.response.JwtAuthenticationResponse;

public interface AuthenticationService {
    JwtAuthenticationResponse signup(SignUpRequest request);

    JwtAuthenticationResponse signin(SignInRequest request);
}
