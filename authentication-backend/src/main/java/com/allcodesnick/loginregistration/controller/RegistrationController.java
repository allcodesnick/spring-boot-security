package com.allcodesnick.loginregistration.controller;


import com.allcodesnick.loginregistration.model.User;
import com.allcodesnick.loginregistration.service.UserService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/")
public class RegistrationController {

    private UserService userService;

    public RegistrationController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/createUserAccount")
    public User createUserAccount(@RequestBody User user){
        return userService.createUserAccount(user);
    }

}
