package com.example.SmartLmsApplication.controller;

import com.example.SmartLmsApplication.entity.Course;
import com.example.SmartLmsApplication.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/courses")
public class CourseController {

    @Autowired
    private CourseService service;

    @PostMapping("/add")
    public Course addCourse(@RequestBody Course c) {
        return service.addCourse(c);
    }

    @GetMapping("/all")
    public List<Course> getAllCourses() {
        return service.getAllCourses();
    }
}