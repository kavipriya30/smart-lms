package com.example.SmartLmsApplication.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.SmartLmsApplication.entity.Course;

public interface CourseRepository extends JpaRepository<Course, Long> { }
