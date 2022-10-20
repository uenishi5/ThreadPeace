package com.example.ThreadPeace.web.user;

import com.example.ThreadPeace.domain.user.User;
import com.example.ThreadPeace.domain.user.UserService;
import com.example.ThreadPeace.domain.userDetail.UserDetail;
import com.example.ThreadPeace.domain.userDetail.UserDetailRepository;
import com.example.ThreadPeace.domain.userDetail.UserDetailService;
import lombok.AllArgsConstructor;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;

@Controller
@RequestMapping("/user")
@AllArgsConstructor
public class UserController {
    private final UserService userService;
    private final UserDetailService detailService;
    @GetMapping
    public String ShowMyPage(@AuthenticationPrincipal User user, Model model){
        UserDetail userDetail = detailService.getUser(user.getId());
        return "/user";
    }

    @GetMapping("delete")
    public String deleteUser(@ModelAttribute deleteUserForm form){
        return "/user/delete";
    }
}
