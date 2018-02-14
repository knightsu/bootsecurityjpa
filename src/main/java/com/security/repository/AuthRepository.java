package com.security.repository;

import com.security.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface AuthRepository extends JpaRepository<User, Long> {

    User findUserByUsername(String username);
}
