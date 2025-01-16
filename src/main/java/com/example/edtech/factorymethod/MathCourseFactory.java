package com.example.edtech.factorymethod;

public class MathCourseFactory extends CourseFactory {

    @Override
    public Course createCourse() {
        return new MathCourse();
    }
}
