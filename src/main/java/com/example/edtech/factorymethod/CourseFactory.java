package com.example.edtech.factorymethod;

/**
 * Factory Method pattern: defines a method for creating Course objects.
 */
public abstract class CourseFactory {
    public abstract Course createCourse();

    /**
     * Common behavior that uses the 'createCourse()' method
     * to get a course instance.
     */
    public void enroll(String studentName) {
        Course course = createCourse();
        course.enrollStudent(studentName);
        System.out.println("Student " + studentName + " enrolled in " + course.getCourseName());
    }
}
