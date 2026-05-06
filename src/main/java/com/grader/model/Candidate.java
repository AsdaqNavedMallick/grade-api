package com.grader.model;

public class Candidate {
    private String name;
    private int score;
    private String grade;
    private String message;

    public Candidate(String name, int score, String grade, String message) {
        this.name = name;
        this.score = score;
        this.grade = grade;
        this.message = message;
    }

    public String getName() { return name; }
    public int getScore() { return score; }
    public String getGrade() { return grade; }
    public String getMessage() { return message; }
}