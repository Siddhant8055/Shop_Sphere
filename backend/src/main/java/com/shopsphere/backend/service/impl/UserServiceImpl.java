package com.shopsphere.backend.service.impl;

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
    public User registerUser(User user) {

        User existingUser = userRepository.findByEmail(user.getEmail());
        return userRepository.save(user);
    }
}
