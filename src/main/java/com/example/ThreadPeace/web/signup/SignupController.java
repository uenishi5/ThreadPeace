package com.example.ThreadPeace.web.signup;

import com.example.ThreadPeace.domain.user.User;
import com.example.ThreadPeace.domain.user.UserService;
import com.example.ThreadPeace.web.user.UserForm;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("signup")
@RequiredArgsConstructor
public class SignupController {
    private final UserService service;

    @GetMapping
    public String showSignupForm(@ModelAttribute UserForm userForm){
        return "signup";
    }

    @PostMapping
    public String signup(@Validated UserForm form, BindingResult bindingResult){
        if(bindingResult.hasErrors()){
            return showSignupForm(form);
        }
        service.createUser(form.getPw(),form.getName(),form.getAge());
        return "login";
    }
}
