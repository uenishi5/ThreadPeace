package com.example.ThreadPeace.domain.recruitment;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface RecruitmentRepository {

    @Select("select * from recruitment")
    List<Recruitment> getRecruitmentList();

}
