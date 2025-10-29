package com.example.SmartLmsApplication.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String title;
    private String description;
    private String instructor;
    private String instructorName;

    public String getName() {
        return title != null ? title : name;
    }

    public String getInstructor() {
        return instructorName != null ? instructorName : instructor;
    }
}
