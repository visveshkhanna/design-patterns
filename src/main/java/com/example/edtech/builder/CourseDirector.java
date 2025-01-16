package com.example.edtech.builder;

/**
 * Director class that defines the order in which to call builder methods.
 */
public class CourseDirector {
    private CourseBuilder builder;

    public CourseDirector(CourseBuilder builder) {
        this.builder = builder;
    }

    public BuiltCourse constructBasicCourse() {
        return builder
                .setTitle("Basic Course")
                .setDescription("An introductory course")
                .addModule("Introduction Module")
                .addModule("Summary Module")
                .build();
    }

    public BuiltCourse constructAdvancedCourse() {
        return builder
                .setTitle("Advanced Course")
                .setDescription("An in-depth course with advanced topics")
                .addModule("Advanced Topic 1")
                .addModule("Advanced Topic 2")
                .addModule("Project")
                .build();
    }
}
