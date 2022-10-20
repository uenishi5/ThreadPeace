package com.example.ThreadPeace.web.ranking;

import com.example.ThreadPeace.domain.ranking.Ranking;
import com.example.ThreadPeace.domain.ranking.RankingService;
import com.example.ThreadPeace.domain.user.User;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("ranking")
@RequiredArgsConstructor
public class RankingController {
    private final RankingService service;

    @GetMapping
    public String showRanking(Model model){
        List<Ranking> rankingList = service.showRanking();
        if(rankingList == null){
            return "/ranking";
        }
        model.addAttribute(rankingList);
        return "/ranking";
    }

    @GetMapping("/myrank")
    public String showMyRanking(@AuthenticationPrincipal User user,Model model){
        Ranking myrank = service.getMyRank(user.getId());
        model.addAttribute("myrank",myrank);
        return "/ranking/myrank";
    }
}
