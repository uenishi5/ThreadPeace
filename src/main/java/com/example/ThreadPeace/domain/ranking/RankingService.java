package com.example.ThreadPeace.domain.ranking;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class RankingService {

    private final RankingRepository repository;

    public List<Ranking> showRanking(){
        return repository.getRanking();
    }

    public Ranking getMyRank(String userId){
        return repository.getMyRank(userId);
    }

    public void updateRank(){
        repository.updateRanking();
    }
}
