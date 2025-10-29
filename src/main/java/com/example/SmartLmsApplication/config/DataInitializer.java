package com.example.SmartLmsApplication.config;

import com.example.SmartLmsApplication.entity.Course;
import com.example.SmartLmsApplication.entity.User;
import com.example.SmartLmsApplication.repository.CourseRepository;
import com.example.SmartLmsApplication.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataInitializer implements CommandLineRunner {

    @Autowired
    private CourseRepository courseRepository;

    @Autowired
    private UserRepository userRepository;

    @Override
    public void run(String... args) throws Exception {
        if (courseRepository.count() == 0) {
            Course course1 = new Course();
            course1.setTitle("Java Programming Fundamentals");
            course1.setDescription("Learn Java programming from basics to advanced concepts");
            course1.setInstructorName("Dr. Sarah Johnson");
            courseRepository.save(course1);

            Course course2 = new Course();
            course2.setTitle("Web Development with Spring Boot");
            course2.setDescription("Build modern web applications using Spring Boot framework");
            course2.setInstructorName("Prof. Michael Chen");
            courseRepository.save(course2);

            Course course3 = new Course();
            course3.setTitle("Database Design and SQL");
            course3.setDescription("Master database design principles and SQL queries");
            course3.setInstructorName("Dr. Emily Rodriguez");
            courseRepository.save(course3);
        }

        if (userRepository.count() == 0) {
            User admin = new User();
            admin.setName("Admin User");
            admin.setEmail("admin@smartlms.com");
            admin.setPassword("admin123");
            admin.setRole("ADMIN");
            userRepository.save(admin);

            User student = new User();
            student.setName("John Doe");
            student.setEmail("john@example.com");
            student.setPassword("student123");
            student.setRole("STUDENT");
            userRepository.save(student);
        }
    }
}