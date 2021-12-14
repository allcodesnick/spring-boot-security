package com.allcodesnick.loginregistration.controller;


import com.allcodesnick.loginregistration.service.UserService;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@RestController
@RequestMapping("/")
public class LoginController {

    private UserService userService;

    public LoginController(UserService userService) {
        this.userService = userService;
    }

    // Redirect Method
    @GetMapping("/other-hello-world")
    public ModelAndView hello(){
        return new ModelAndView("redirect:/");
    }

}
