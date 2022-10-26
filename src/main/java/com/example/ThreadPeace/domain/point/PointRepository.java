package com.example.ThreadPeace.domain.point;

import org.apache.ibatis.annotations.Update;

public interface PointRepository {
    @Update("update point set point = #{point} where userid = #{userId}")
    void pointOperation(String userId,int point);
}
