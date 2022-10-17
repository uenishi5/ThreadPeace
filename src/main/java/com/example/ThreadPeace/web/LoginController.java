package com.example.ThreadPeace.web;

import lombok.RequiredArgsConstructor;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequiredArgsConstructor
public class LoginController {

    @GetMapping
    public String showTop(Authentication auth){
        var role = auth.getAuthorities();
        if(role.equals("ADMIN")){
            return "admin/top";
        } else if (role.equals("USER")) {
            return "user/top";
        } else {
            return "recruiter/top";
        }
    }

    @GetMapping("login")
    public String showLoginForm(){
        return "login";
    }
}
