package com.security.service;

import com.security.domain.User;

public interface AuthService {
    void save(User user);
    User findByUsername(String username);
}
