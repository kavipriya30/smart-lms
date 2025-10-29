package com.example.SmartLmsApplication.service;

import com.example.SmartLmsApplication.entity.Course;
import com.example.SmartLmsApplication.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class CourseService {
    @Autowired
    private CourseRepository repo;

    public Course addCourse(Course c) {
        return repo.save(c);
    }

    public List<Course> getAllCourses() {
        return repo.findAll();
    }
}
