package com.brownow.project.user.controller;

import com.brownow.project.user.service.UserService;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/user")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }
}
