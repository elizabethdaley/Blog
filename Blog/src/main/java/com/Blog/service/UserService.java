package com.Blog.service;

import com.Blog.dto.RegistrationDto;
import com.Blog.entity.User;

public interface UserService {
    void saveUser(RegistrationDto registrationDto);

    User findByEmail(String email);
}