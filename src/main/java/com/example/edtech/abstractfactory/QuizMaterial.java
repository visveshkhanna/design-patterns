package com.example.edtech.abstractfactory;

public class QuizMaterial implements CourseMaterial {
    private String quizTitle;

    public QuizMaterial(String quizTitle) {
        this.quizTitle = quizTitle;
    }

    @Override
    public void displayContent() {
        System.out.println("Starting quiz: " + quizTitle);
    }
}
