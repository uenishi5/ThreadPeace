package com.example.ThreadPeace.domain.ranking;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Ranking {
    private String username;
    private String userid;
    private int point;
}
