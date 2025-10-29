package com.example.SmartLmsApplication.controller;

import com.example.SmartLmsApplication.entity.Course;
import com.example.SmartLmsApplication.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Arrays;
import java.util.List;

@Controller
public class WebController {

    @Autowired
    private CourseService courseService;

    @GetMapping("/")
    public String home() {
        return "index";
    }

    @GetMapping("/login")
    public String login() {
        return "login";
    }

    @PostMapping("/login")
    public String loginPost(@RequestParam String username, @RequestParam String password, Model model) {
        // Simple authentication - any username/password works
        if (username != null && !username.trim().isEmpty() && password != null && !password.trim().isEmpty()) {
            return "redirect:/dashboard";
        }
        model.addAttribute("error", "Please enter username and password");
        return "login";
    }

    @GetMapping("/dashboard")
    public String dashboard() {
        return "dashboard";
    }

    @GetMapping("/courses")
    public String courses(Model model) {
        // Create sample courses
        List<Course> courses = Arrays.asList(
            createCourse(1L, "Java Programming", "Learn Java from basics to advanced", "Dr. Smith"),
            createCourse(2L, "Web Development", "HTML, CSS, JavaScript and frameworks", "Prof. Johnson"),
            createCourse(3L, "Database Design", "SQL and database management", "Dr. Brown")
        );
        model.addAttribute("courses", courses);
        return "course-list";
    }

    @GetMapping("/quiz")
    public String quiz(Model model) {
        // Create sample quiz questions
        List<QuizQuestion> questions = Arrays.asList(
            new QuizQuestion("What is Java?", Arrays.asList("Programming Language", "Coffee", "Island", "Framework")),
            new QuizQuestion("Which is a web framework?", Arrays.asList("Spring", "Hibernate", "Maven", "Git"))
        );
        model.addAttribute("questions", questions);
        return "quiz";
    }

    @GetMapping("/profile")
    public String profile() {
        return "profile";
    }

    @GetMapping("/logout")
    public String logout() {
        return "redirect:/";
    }

    private Course createCourse(Long id, String title, String description, String instructor) {
        Course course = new Course();
        course.setId(id);
        course.setTitle(title);
        course.setDescription(description);
        course.setInstructorName(instructor);
        return course;
    }

    public static class QuizQuestion {
        private String text;
        private List<String> options;

        public QuizQuestion(String text, List<String> options) {
            this.text = text;
            this.options = options;
        }

        public String getText() { return text; }
        public List<String> getOptions() { return options; }
    }
}