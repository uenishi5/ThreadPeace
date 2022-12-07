package com.example.ThreadPeace.web;

import com.example.ThreadPeace.domain.recruitment.RecruitmentRepository;
import com.example.ThreadPeace.domain.recruitment.RecruitmentService;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequiredArgsConstructor
public class LoginController {
    public final RecruitmentService service;
    @GetMapping
    public String showTop(Model model, Authentication auth){
        var isAdmin = auth.getAuthorities()
                .stream()
                .map(GrantedAuthority::getAuthority)
                .anyMatch(a -> a.equals("ADMIN"));
        if(isAdmin){
            return "/admin/top";
        }
        model.addAttribute("recruitmentList",service.getRecruitmentList());
        return "/recruitment/recruitment";
    }

    @GetMapping("login")
    public String showLoginForm () {
        return "login";
    }
}
