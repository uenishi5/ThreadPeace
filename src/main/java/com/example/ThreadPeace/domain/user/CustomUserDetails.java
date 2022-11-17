package com.example.ThreadPeace.domain.user;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.User;

import java.util.Collection;
import java.util.List;

public class CustomUserDetails  extends User {
    public CustomUserDetails(String id, String pw, Collection<? extends GrantedAuthority> authorities) {
        super(id, pw, authorities);
    }
}
