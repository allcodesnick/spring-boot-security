package com.allcodesnick.loginregistration.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;


@RestController
public class HomeController {


    public HomeController() {
    }

    @GetMapping("/")
    public String home(){
        return "index";
    }

    @GetMapping("/login")
    public String login(){
        return "login";
    }

    // Redirect Method to Login
    @GetMapping("/create-order-request")
    public ModelAndView createOrderRequest(){
        return new ModelAndView("redirect:/login");
    }

    // Redirect Method
    @GetMapping("/other-hello-world")
    public ModelAndView hello(){
        return new ModelAndView("redirect:/");
    }
}
