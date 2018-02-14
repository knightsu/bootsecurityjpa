package com.security.repository;

import com.security.domain.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface RoleRepository extends JpaRepository<Role, Long> {
    List<Role> findRolesByName(String username);
}
