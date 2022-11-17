package com.example.ThreadPeace.domain.recruitmentDetail;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Date;

@Data
@AllArgsConstructor
public class RecruitmentDetail {
    private int id;
    private int postid;
    private String activitytheme;
    private String area;
    private Date schedule;
    private String target;
    private String status;
    private String postUserId;
    private String joinUserId;
    private int age;
    private int recruitmentNumbers;
}