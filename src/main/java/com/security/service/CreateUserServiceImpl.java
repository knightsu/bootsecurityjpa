package com.security.service;

import com.security.domain.User;
import com.security.domain.UserInfo;
import org.springframework.stereotype.Service;

@Service
public class CreateUserServiceImpl implements CreateUserService{
    @Override
    public User createUser(UserInfo userInfo, String npassword) {
        User user = new User();
        user.setEmail(userInfo.getEmail());
        user.setUsername(userInfo.getFirstName()+userInfo.getLastName());
        user.setPassword(npassword);
        return user;
    }
}
