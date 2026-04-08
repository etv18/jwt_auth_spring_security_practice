package com.tavarlabs.jwtauthpractice.repository;

import com.tavarlabs.jwtauthpractice.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
    boolean existsByUsername(String username);
}
