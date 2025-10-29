package com.example.SmartLmsApplication.controller;

import com.example.SmartLmsApplication.entity.Quiz;
import com.example.SmartLmsApplication.service.QuizService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/quiz")
public class QuizController {

    @Autowired
    private QuizService service;

    @PostMapping("/add")
    public Quiz addQuiz(@RequestBody Quiz quiz) {
        return service.addQuiz(quiz);
    }

    @GetMapping("/all")
    public List<Quiz> getAllQuizzes() {
        return service.getAllQuizzes();
    }
}
