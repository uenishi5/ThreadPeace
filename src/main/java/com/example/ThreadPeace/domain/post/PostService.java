package com.example.ThreadPeace.domain.post;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@AllArgsConstructor
public class PostService {
    private final PostRepository repository;

    public List<Post> getPostList(){
        return repository.getPostList();
    }

    public void post(String goal,String summary){
        repository.post(goal,summary);
    }

    public void deletePost(String postId){
        repository.deletePost(postId);
    }

}
