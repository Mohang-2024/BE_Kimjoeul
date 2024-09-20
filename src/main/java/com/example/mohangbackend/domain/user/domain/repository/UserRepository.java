package com.example.mohangbackend.domain.user.domain.repository;

import com.example.mohangbackend.domain.user.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    Boolean existsByAccountId(String accountId);

    Optional<User> findByAccountId(String accountId);
}
