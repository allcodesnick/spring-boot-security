package com.allcodesnick.loginregistration.service.impl;

import com.allcodesnick.loginregistration.model.ApplicationUserDetails;
import com.allcodesnick.loginregistration.model.User;
import com.allcodesnick.loginregistration.repository.UserRepository;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserDetailManager implements UserDetailsService {

    private UserRepository userRepository;

    public UserDetailManager(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Optional<User> user = userRepository.findUserByUsername(username);
        user.orElseThrow(() -> new UsernameNotFoundException("Not Found" + username));
        return user.map(ApplicationUserDetails::new).get();
    }
}
