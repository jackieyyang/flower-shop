package com.jackieyang.flowershop.controller;

import cn.dev33.satoken.stp.StpUtil;
import com.jackieyang.flowershop.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @PostMapping("/login")
    public String login() {
        StpUtil.login(10001);
        return "10001 login success";
    }

    @PostMapping("/register")
    public String register() {
        return "register";
    }

    @PostMapping("/logout")
    public String logout() {
        return "logout";
    }

    @GetMapping("/info")
    public String getInfo() {
        return "getInfo";
    }

    @PostMapping("/info")
    public String addInfo() {
        return "addInfo";
    }

    @PutMapping("/info")
    public String updateInfo() {
        return "updateInfo";
    }

    @DeleteMapping("/info")
    public String deleteInfo() {
        return "deleteInfo";
    }

}
