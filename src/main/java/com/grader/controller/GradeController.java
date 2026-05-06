package com.grader.controller;

import com.grader.model.Candidate;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class GradeController {

    @GetMapping("/grade")
    public Candidate getGrade(
            @RequestParam String name,
            @RequestParam int score) {

        String grade;
        String message;

        if (score >= 90) {
            grade = "A";
            message = "Excellent! Outstanding performance.";
        } else if (score >= 80) {
            grade = "B";
            message = "Great job! Above average performance.";
        } else if (score >= 70) {
            grade = "C";
            message = "Good. Average performance.";
        } else if (score >= 60) {
            grade = "D";
            message = "Below average. Needs improvement.";
        } else {
            grade = "F";
            message = "Poor performance. Keep practicing!";
        }

        return new Candidate(name, score, grade, message);
    }
}