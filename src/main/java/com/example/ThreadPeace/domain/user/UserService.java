package com.example.ThreadPeace.domain.user;

import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository repository;
    private final PasswordEncoder encoder;

    public void createUser(String id,String pw,String name,int age) {
        var encodPassword = encoder.encode(pw);
        repository.createUser(id,encodPassword,"user");
        repository.createDetailUser(id,name,age,0);
    }
}
