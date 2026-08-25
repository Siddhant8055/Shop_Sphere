package com.shopsphere.backend.service;

import com.shopsphere.backend.dto.UserRegistrationRequestDTO;
import com.shopsphere.backend.dto.UserResponseDTO;
import com.shopsphere.backend.entity.User;

public interface UserService {
    User registerUser(User user);
    UserResponseDTO registerUser(UserRegistrationRequestDTO dto);
}
