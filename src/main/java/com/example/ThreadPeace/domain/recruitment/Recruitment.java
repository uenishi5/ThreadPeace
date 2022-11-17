package com.example.ThreadPeace.domain.recruitment;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Recruitment {
    private int id;
    private String goal;
    private String summary;

    private String area;

    private int recruitmentNumbers;
}