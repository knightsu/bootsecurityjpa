package service;

import domain.User;

public interface AuthService {
    void save(User user);
    User findByUsername(String username);
}
