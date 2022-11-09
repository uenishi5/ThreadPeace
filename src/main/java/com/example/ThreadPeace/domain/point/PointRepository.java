package com.example.ThreadPeace.domain.point;

import com.example.ThreadPeace.domain.userDetail.UserDetail;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Service;

import java.util.List;

@Mapper
public interface PointRepository {
    @Update("update point set point = #{point} where userid = #{userId}")
    void pointOperation(String userId,int point);

    @Select("select * from user_detail order by point desc,name asc")
    List<UserDetail> getRanking();
}
