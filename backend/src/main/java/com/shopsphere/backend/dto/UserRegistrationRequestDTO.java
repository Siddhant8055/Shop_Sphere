package com.shopsphere.backend.dto;

import com.shopsphere.backend.entity.User;
import lombok.Data;

@Data
public class UserRegistrationRequestDTO {
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private String phoneNumber;

//    user.setfirstName(dto.getfirstName());
}
