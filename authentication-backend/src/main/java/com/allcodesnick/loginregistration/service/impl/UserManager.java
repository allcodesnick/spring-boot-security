package com.allcodesnick.loginregistration.service.impl;


import com.allcodesnick.loginregistration.model.User;
import com.allcodesnick.loginregistration.repository.UserRepository;
import com.allcodesnick.loginregistration.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;


@Service
public class UserManager implements UserService {

    @Autowired
    private BCryptPasswordEncoder passwordEncoder;

    private UserRepository userRepository;

    public UserManager(UserRepository userRepository) {
        this.userRepository = userRepository;

    }

    @Override
    public User createUserAccount(User user){
        User newUserAccount = new User(user.getUsername(), passwordEncoder.encode(user.getPassword()));
        return userRepository.save(newUserAccount);
    }

}
