package com.example.ThreadPeace.domain.user;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class User {
    private String id; //メールアドレス
    private String pw;
    private Authority authority;

    public enum Authority {
        ADMIN, USER
    }
}
