package com.example.ThreadPeace.domain.recruitment;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.util.List;

@Service
@AllArgsConstructor
public class RecruitmentService {
    private final RecruitmentRepository recruitmentRepository;
    //private final RecruitmentDetailRepository detailRepository;

    public List<Recruitment> getRecruitmentList(){
        return recruitmentRepository.getRecruitmentList();
    }


}