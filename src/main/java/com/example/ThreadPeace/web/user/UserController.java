package com.example.ThreadPeace.web.user;

import com.example.ThreadPeace.domain.point.PointService;
import com.example.ThreadPeace.domain.user.User;
import com.example.ThreadPeace.domain.user.UserService;
import com.example.ThreadPeace.domain.userDetail.UserDetail;
import com.example.ThreadPeace.domain.userDetail.UserDetailService;
import lombok.AllArgsConstructor;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.naming.AuthenticationNotSupportedException;
import java.util.List;

@Controller
@RequestMapping("/user")
@AllArgsConstructor
public class UserController {
    private final UserDetailService detailService;
    public final PointService pointService;
    private final UserService userService;
    @GetMapping
    public String ShowMyPage(@AuthenticationPrincipal User user, Model model){
        UserDetail userDetail = detailService.getUser(user.getId());
        return "/user";
    }

    @GetMapping("/ranking")
    public String showRanking(Model model,Authentication authentication){
        List<UserDetail> pointRanking = pointService.getRanking();
        //年齢取得する必要ないから、無駄な処理をしている
        UserDetail user = detailService.selectUser(authentication.getName());
        model.addAttribute("user",user);
        model.addAttribute("rankingList",pointRanking);
        return "/user/ranking";
    }

    @GetMapping("/profile")
    public String showProfile(Authentication authentication, Model model){
        UserDetail user = detailService.selectUser(authentication.getName());
        model.addAttribute("user",user);
        return "/user/profile";
    }

//    @GetMapping("delete")
//    public String deleteUser(@ModelAttribute deleteUserForm form){
//        return "/user/delete";
//    }
}