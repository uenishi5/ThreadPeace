package com.example.ThreadPeace.domain.point;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PointService {
    private final PointRepository repository;

    public void addPoint(String userId){
        repository.addPoint(userId);
    }

    public void usePoint(String userId){
        repository.usePoint(userId);
    }
}
