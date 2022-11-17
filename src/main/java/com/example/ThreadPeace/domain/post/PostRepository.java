package com.example.ThreadPeace.domain.post;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Service;

import java.util.List;

@Mapper
public interface PostRepository {

    @Select("select * from post order by date desc")
    List<Post> getPostList();
}
