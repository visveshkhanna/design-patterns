package com.example.edtech.factorymethod;

public class ScienceCourse extends Course {

    public ScienceCourse() {
        this.courseName = "Science 101";
        this.description = "Basic scientific concepts";
    }

    @Override
    public void enrollStudent(String studentName) {
        System.out.println("Enrolling " + studentName + " in Science Course");
    }
}
