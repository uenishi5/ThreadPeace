package com.example.ThreadPeace.domain.point;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Point {
    private String userId;
    private int rank;
    private int point;
}
