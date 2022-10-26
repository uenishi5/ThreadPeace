package com.example.ThreadPeace.domain.user;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.Optional;

@Mapper
public interface UserRepository {
    @Select("select * from user where id = #{id}")
    Optional<User> findByUser(String id);

    @Insert("insert into user values(#{id},#{encodPassword},#{user})")
    void createUser(String id, String encodPassword, String user);

    @Insert("insert into user_detail values(#{id},#{name},#{age},#{point})")
    void createDetailUser(String id, String name, int age, int point);
}
