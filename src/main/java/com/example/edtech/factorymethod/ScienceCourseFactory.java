package com.example.edtech.factorymethod;

public class ScienceCourseFactory extends CourseFactory {

    @Override
    public Course createCourse() {
        return new ScienceCourse();
    }
}
