package com.example.ThreadPeace.domain.userDetail;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class UserDetailService {
    private final UserDetailRepository repository;

    public UserDetail getUser(String id) {
        return repository.getUser(id);
    }
}
