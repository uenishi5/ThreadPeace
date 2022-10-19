package com.example.ThreadPeace.domain.postDetail;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class PostDetail {
    private int id;
    private int postid;
    private String activitytheme;
    private String arena;
    private String schedule;
    private String target;
    private String status;
    private String postUserId;
    private String joinUserId;
    private int age;
    private int recruitmentnumbers;
}