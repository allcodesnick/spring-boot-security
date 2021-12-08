package com.allcodesnick.loginregistration.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@RestController
@RequestMapping("/")
public class HomeController {


    public HomeController() {
    }

    @GetMapping("/")
    public String home(){
        return ("<h1>Welcome Home</h1>");
    }


    // Redirect Method to Login
    @GetMapping("/create-order-request")
    public ModelAndView createOrderRequest(){
        return new ModelAndView("redirect:/login");
    }
}
