package com.shopsphere.backend.service.impl;

import com.shopsphere.backend.dto.UserRegistrationRequestDTO;
import com.shopsphere.backend.dto.UserResponseDTO;
import org.springframework.stereotype.Service;

import com.shopsphere.backend.entity.User;
import com.shopsphere.backend.repository.UserRepository;
import com.shopsphere.backend.service.UserService;


@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;
    
    public UserServiceImpl(UserRepository userRepository){
        this.userRepository = userRepository;
}

    @Override
    public UserResponseDTO registerUser(UserRegistrationRequestDTO dto) {
        User user = new User();
        user.setFirstName(dto.getFirstName());
        user.setLastName(dto.getLastName());
        user.setEmail(dto.getEmail());
        user.setPhoneNumber(dto.getPhoneNumber());
        user.setPassword(dto.getPassword());
        return null;
    }

    @Override
    public User registerUser(User user) {

        User existingUser = userRepository.findByEmail(user.getEmail());
        if(existingUser != null){
        throw new RuntimeException("Email already exists");
        }
        return userRepository.save(user);
    }
}
