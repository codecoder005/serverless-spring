package com.orgofarmsgroup.function;

import com.orgofarmsgroup.entity.UserEntity;
import com.orgofarmsgroup.sertice.UserService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Supplier;

@Configuration
@RequiredArgsConstructor
@Slf4j
public class UserFunction {
    private final UserService userService;
    @Bean
    public Supplier<List<UserEntity>> users() {
        log.info("user function: users");
        return userService::users;
    }

    @Bean
    public Consumer<String> create() {
        log.info("user function: users(email)");
        return userService::users;
    }
}
