package com.example.ThreadPeace.web;

import lombok.RequiredArgsConstructor;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequiredArgsConstructor
public class LoginController {

    @GetMapping
    public String showTop(Authentication auth){
        var isAdmin = auth.getAuthorities()
                .stream()
                .map(GrantedAuthority::getAuthority)
                .anyMatch(a -> a.equals("ADMIN"));
        if(isAdmin){
            return "/admin/top";
        }
        return "top";
    }

    @GetMapping("login")
    public String showLoginForm () {
        return "login";
    }
}
