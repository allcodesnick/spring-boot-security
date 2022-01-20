package com.allcodesnick.loginregistration.controller.admin;

import com.allcodesnick.loginregistration.model.User;
import com.allcodesnick.loginregistration.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


import java.util.List;

@RestController("/admin/")
public class AdminAccountController {
    private UserService userService;

    public AdminAccountController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/accounts")
    public List<User> listUserAccounts(){
        return userService.listUserAccounts();
    }

}
