package com.example.ThreadPeace.domain.userDetail;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class UserDetail {
    private String userId;
    private String name;
    private int age;
    private int point;
}
