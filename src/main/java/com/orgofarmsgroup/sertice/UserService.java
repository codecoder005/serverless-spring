package com.orgofarmsgroup.sertice;

import com.orgofarmsgroup.entity.UserEntity;
import com.orgofarmsgroup.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

@Service
@Slf4j
@RequiredArgsConstructor
public class UserService {
    private final AtomicLong uidGenerator = new AtomicLong(101L);
    private final UserRepository userRepository;

    public List<UserEntity> users() {
        log.info("users service: users");
        return userRepository.findAll();
    }

    public UserEntity users(String email) {
        log.info("users service: users(email)");
        UserEntity user = UserEntity.builder()
                .uid(uidGenerator.getAndIncrement())
                .email(email)
                .build();
        return userRepository.save(user);
    }
}
