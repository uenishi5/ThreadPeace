package com.example.ThreadPeace.web.postDetail;

import com.example.ThreadPeace.domain.postDetail.PostDetailService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("postdetail")
@RequiredArgsConstructor
public class PostDetailController {
    private final PostDetailService service;

    @GetMapping
    public String showPostDetail(@PathVariable("postId") int id, Model model){
        model.addAttribute("postDetail",service.showPostDetail(id));
        return "/postdetail/{id}";
    }
}
