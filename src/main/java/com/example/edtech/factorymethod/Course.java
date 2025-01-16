package com.example.edtech.factorymethod;

/**
 * Common interface or abstract class for different types of Courses.
 */
public abstract class Course {
    protected String courseName;
    protected String description;

    public String getCourseName() {
        return courseName;
    }

    public String getDescription() {
        return description;
    }

    public abstract void enrollStudent(String studentName);
}
