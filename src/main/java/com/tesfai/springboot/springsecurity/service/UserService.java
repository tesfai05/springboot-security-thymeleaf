package com.tesfai.springboot.springsecurity.service;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.tesfai.springboot.springsecurity.dto.UserRegistrationDto;
import com.tesfai.springboot.springsecurity.model.User;


public interface UserService extends UserDetailsService {

    User findByEmail(String email);

    User save(UserRegistrationDto registration);
}
