package com.example.boardv1.user;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UserController {

    private final UserService userService;

    UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/join")
    public String join(UserRequest.JoinDTO reqDTO) { // reqDTO
        userService.회원가입(reqDTO.getUsername(), reqDTO.getPassword(), reqDTO.getEmail());
        return "redirect:/login-form";
    }

    @GetMapping("/login-form")
    public String loginForm() {
        return "/user/login-form";
    }

    @GetMapping("/join-form")
    public String joinForm() {
        return "/user/join-form";
    }
}
