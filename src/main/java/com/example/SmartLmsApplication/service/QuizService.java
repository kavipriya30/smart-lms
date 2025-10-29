package com.example.SmartLmsApplication.service;

import com.example.SmartLmsApplication.entity.Quiz;
import com.example.SmartLmsApplication.repository.QuizRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class QuizService {
    @Autowired
    private QuizRepository repo;

    public Quiz addQuiz(Quiz q) {
        return repo.save(q);
    }

    public List<Quiz> getAllQuizzes() {
        return repo.findAll();
    }
}
