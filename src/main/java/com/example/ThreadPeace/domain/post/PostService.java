package com.example.ThreadPeace.domain.post;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class PostService {
    private final PostRepository repository;

//    public List<Post> getPostList(){
//        return repository.getPostList();
//    }

}
