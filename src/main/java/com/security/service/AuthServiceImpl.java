package com.security.service;

import com.security.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.security.repository.AuthRepository;

@Service
public class AuthServiceImpl implements AuthService{
    @Autowired
    AuthRepository authRepository;

    @Override
    public void save(User user) {
        authRepository.save(user);
    }

    @Override
    public User findByUsername(String username) {
        return authRepository.findUserByUsername(username);
    }
}
