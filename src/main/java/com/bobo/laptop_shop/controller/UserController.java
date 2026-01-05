package com.bobo.laptop_shop.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bobo.laptop_shop.service.UserService;

// @Controller
// public class UserController {

//     @RequestMapping("/")
//     public String getHomepage() {
//         return "Welcome to the Laptop Shop!I am Bobo.";
//     }
// }

@RestController
public class UserController {

    private UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("")
    public String getHomepage() {
        return userService.handlehello();
    }
}