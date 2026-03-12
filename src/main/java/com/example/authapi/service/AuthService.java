package com.example.authapi.service;

import com.example.authapi.dto.LoginRequest;
import com.example.authapi.dto.SignupRequest;

public interface AuthService {

    void signup(SignupRequest request);

    void login(LoginRequest request);
}