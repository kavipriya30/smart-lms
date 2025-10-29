package com.example.SmartLmsApplication.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.SmartLmsApplication.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByEmail(String email);
}
