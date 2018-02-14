package com.security.controller;

import com.security.domain.User;
import com.security.domain.UserInfo;
import com.security.service.AuthServiceImpl;
import com.security.service.CreateUserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import sun.plugin.util.UserProfile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.security.Principal;
import java.util.logging.Logger;

@CrossOrigin(origins = {"http://localhost:8000", "null"})
@RequestMapping(value = "/")
@RestController
public class UserController {

    @Autowired
    HttpServletRequest httpServletRequest;

    @Autowired
    AuthServiceImpl authService;

    @Autowired
    CreateUserServiceImpl createUserService;

    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public String registration(@RequestBody UserInfo userInfo, HttpServletResponse httpServletResponse)
    {
        System.out.print("register");
        String password = userInfo.getPassWord();
        PasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        String npassword = passwordEncoder.encode(password);
        User user = createUserService.createUser(userInfo, npassword);
        authService.save(user);
        System.out.println(password);
        return "register";
    }
    @RequestMapping(value = "/user", method = RequestMethod.GET)
    public Principal user(Principal user)
    {
        System.out.print(user.getName());
        return user;
    }
//    @RequestMapping(value = "/", method = RequestMethod.GET)
//    public  String home() {
//        System.out.print("first");
//        return "index";}
    @GetMapping("/test")
    public String test()
    {
        return "test";
    }



}
