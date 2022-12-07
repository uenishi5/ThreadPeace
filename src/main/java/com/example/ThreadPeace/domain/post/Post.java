package com.example.ThreadPeace.domain.post;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Post {
    private int postId;
    private String image;
    private int likeCount;
    private String detail;
    private String userName;
    private String icon;
}