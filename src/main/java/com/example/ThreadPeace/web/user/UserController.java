package com.example.ThreadPeace.web.user;

import com.example.ThreadPeace.domain.user.UserService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
@AllArgsConstructor
public class UserController {
    private final UserService service;

    @GetMapping

}
