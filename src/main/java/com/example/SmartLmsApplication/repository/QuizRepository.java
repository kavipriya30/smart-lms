package com.example.SmartLmsApplication.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.SmartLmsApplication.entity.Quiz;

public interface QuizRepository extends JpaRepository<Quiz, Long> { }
