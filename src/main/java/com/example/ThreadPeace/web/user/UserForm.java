package com.example.ThreadPeace.web.user;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;


@Data
@AllArgsConstructor
public class UserForm {

    @NotBlank
    @Email
    private String mx;

    @NotBlank
    private String name;

    @Size(min=10,max=128)
    private String pw;

    @NotBlank
    @Size(min=6,max=80)
    private int age;
}