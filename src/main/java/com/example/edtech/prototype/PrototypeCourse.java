package com.example.edtech.prototype;

/**
 * A prototype object that can be cloned.
 */
public class PrototypeCourse implements Cloneable {
    private String courseTitle;
    private String content;
    private String creator;

    public PrototypeCourse(String courseTitle, String content, String creator) {
        this.courseTitle = courseTitle;
        this.content = content;
        this.creator = creator;
    }

    // Getters
    public String getCourseTitle() {
        return courseTitle;
    }

    public String getContent() {
        return content;
    }

    public String getCreator() {
        return creator;
    }

    @Override
    public PrototypeCourse clone() {
        try {
            return (PrototypeCourse) super.clone();
        } catch (CloneNotSupportedException e) {
            // Fallback or re-throw as a runtime exception
            throw new RuntimeException("Clone not supported", e);
        }
    }
}
