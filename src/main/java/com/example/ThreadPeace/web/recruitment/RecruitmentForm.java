package com.example.ThreadPeace.web.recruitment;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.sql.Timestamp;

@Data
@AllArgsConstructor
public class RecruitmentForm {


    @NotBlank
    private String goal;

    @NotBlank
    private String summary;

    @NotBlank
    private String activity_theme;

    @NotBlank
    private String area;

    @NotBlank
    private Timestamp schedule;  //日付型？　文字型？

    @NotBlank
    private String target;

    @NotBlank
    private String status;

    @NotBlank
    @Size(min=5)
    private int age;

    @NotBlank
    private int recruitment_numbers;
}
