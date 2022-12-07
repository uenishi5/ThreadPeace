package com.example.ThreadPeace.web.postDetail;

import com.example.ThreadPeace.domain.post.PostService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/post")
@RequiredArgsConstructor
public class PostDetailController {
    private final PostService service;

    @GetMapping
    public String showPostList(Model model){
        model.addAttribute("postList",service.getPostList());

        return "/post/postList";
    }
}
