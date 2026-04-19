package za.ac.cput.jobassistantapi.service;

import za.ac.cput.jobassistantapi.dto.request.LoginRequest;
import za.ac.cput.jobassistantapi.dto.request.RegisterRequest;
import za.ac.cput.jobassistantapi.dto.response.AuthResponse;

public interface AuthService {

    AuthResponse register(RegisterRequest request);

    AuthResponse login(LoginRequest request);
}