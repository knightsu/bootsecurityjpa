package com.security.service;

import com.security.domain.Role;
import com.security.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import com.security.repository.RoleRepository;
import com.security.repository.UserRepository;

import java.util.ArrayList;
import java.util.List;

@EnableJpaRepositories(basePackages = "com.security.repository")
@Service
public class UserDetailsServiceImpl implements UserDetailsService {

    @Autowired
    private  UserRepository userRepository;
    @Autowired
    private  RoleRepository roleRepository;

//    public UserDetailsServiceImpl(UserRepository userRepository, RoleRepository roleRepository)
//    {
//        this.userRepository=userRepository;
//        this.roleRepository=roleRepository;
//    }

    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {

        User user = userRepository.findUserByEmail(s);
//        List<Role> roles = roleRepository.findRolesByName(s);
        List<GrantedAuthority> authorities = new ArrayList<GrantedAuthority>();
        authorities.add(new SimpleGrantedAuthority("user"));
//        for(Role role : roles)
//        {
//            authorities.add(new SimpleGrantedAuthority(role.getName()));
//        }

        return new org.springframework.security.core.userdetails.User(user.getUsername(), user.getPassword(), authorities);
    }
}
