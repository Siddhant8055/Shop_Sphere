package com.shopsphere.backend.service;

import com.shopsphere.backend.dto.UserRegistrationRequestDTO;
import com.shopsphere.backend.dto.UserResponseDTO;
import com.shopsphere.backend.entity.User;

public interface UserService {
    UserResponseDTO registerUser(UserRegistrationRequestDTO dto);
}
