package com.example.ThreadPeace.web.recruitment;

import com.example.ThreadPeace.domain.recruitment.Recruitment;
import com.example.ThreadPeace.domain.recruitment.RecruitmentService;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.Banner;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/recruitment")
@RequiredArgsConstructor
public class RecruitmentController {
    public RecruitmentService service;

    @GetMapping
    public String showRecruitment(Model model){
        List<Recruitment> recruitmentList = service.getRecruitmentList();
        if(recruitmentList == null){
            return "/recruitment/recruitment";
        }
        model.addAttribute("recruitmentList",recruitmentList);
        return "/recruitment/recruitment";
    }

    @GetMapping("/create")
    public String showCreateForm(@ModelAttribute RecruitmentForm form){
        return "/recruitment/recruitmentForm";
    }

    //遷移後の画面について決めていないのでとりあえず”void”にしている
    @PostMapping("/create")
    public void createRecruitment(@Validated RecruitmentForm form, BindingResult bindingResult){
        if(bindingResult.hasErrors()){
            showCreateForm(form);
        }else {
            //service.create(form.getGoal(),form.getSummary(),form.getArea(),form.getRecruitment_numbers());
            //詳細テーブルからIDを取得する必要がある？
        }
        //作成後どの画面に遷移するか？？　一覧？　”成功しました”通知画面？
    }
}
