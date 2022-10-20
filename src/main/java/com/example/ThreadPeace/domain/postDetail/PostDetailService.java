package com.example.ThreadPeace.domain.postDetail;

import com.example.ThreadPeace.domain.post.PostRepository;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
@RequiredArgsConstructor
public class PostDetailService {

    private final PostRepository repository;

    public PostDetail showPostDetail(int postId){
        return repository.getPostDetail(postId);
    }

    public void addPostDetail(String postId, String activTheme, String arena, Date schedule,String target,String status,int age,int recnum){
        repository.addPostDetail(postId,activTheme,arena,schedule,target,status,age,recnum);
    }

    public void deletePostDetail(String postDetailId){
        repository.deletePostDetail(postDetailId);
    }
}
