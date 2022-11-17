package com.example.ThreadPeace.domain.point;

import com.example.ThreadPeace.domain.userDetail.UserDetail;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PointService {
    private final PointRepository repository;

    public void pointOperation(String userId,int point){
        repository.pointOperation(userId,point);
    }


    public List<UserDetail> getRanking() {
        return repository.getRanking();
    }
}
