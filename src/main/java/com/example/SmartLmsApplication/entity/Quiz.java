package com.example.SmartLmsApplication.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Quiz {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String courseTitle;
    private String question;
    private String answer;
}
