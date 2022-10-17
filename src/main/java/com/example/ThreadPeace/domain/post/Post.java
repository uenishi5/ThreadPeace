package com.example.ThreadPeace.domain.post;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Post {
    private int id;
    private String goal;
    private String summary;
}
