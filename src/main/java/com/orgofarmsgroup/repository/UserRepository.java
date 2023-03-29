package com.orgofarmsgroup.repository;

import com.orgofarmsgroup.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserEntity, Long> {

}
