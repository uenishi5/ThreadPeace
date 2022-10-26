package com.example.ThreadPeace.domain.userDetail;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface UserDetailRepository {
    @Select("select * from user_detail where user_id = #{id}")
    UserDetail getUser(String id);
}
