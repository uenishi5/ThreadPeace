package com.example.ThreadPeace.domain.userDetail;

import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserDetailService {
    private final UserDetailRepository repository;

    public UserDetail getUser(String id) {
        return repository.getUser(id);
    }

    public UserDetail selectUser(String userId) {
        return repository.getUser(userId);
    }
}
