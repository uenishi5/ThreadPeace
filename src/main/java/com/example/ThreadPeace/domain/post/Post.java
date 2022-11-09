package com.example.ThreadPeace.domain.post;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Post {
    private String userName;
    private String detail;
    private int likeCount;
}
