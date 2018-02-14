package com.security.service;

import com.security.domain.User;
import com.security.domain.UserInfo;

public interface CreateUserService {
    User createUser(UserInfo userInfo, String npassword);
}
