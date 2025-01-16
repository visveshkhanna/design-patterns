package com.example.edtech.factorymethod;

public class MathCourse extends Course {

    public MathCourse() {
        this.courseName = "Mathematics 101";
        this.description = "Basic mathematical concepts";
    }

    @Override
    public void enrollStudent(String studentName) {
        System.out.println("Enrolling " + studentName + " in Math Course");
    }
}
