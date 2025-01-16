package com.example.edtech.builder;

import java.util.ArrayList;
import java.util.List;

/**
 * The product class that the Builder will construct.
 */
public class BuiltCourse {
    private String title;
    private String description;
    private List<String> modules;

    // We keep the constructor package-private so only the builder can create it.
    BuiltCourse(String title, String description, List<String> modules) {
        this.title = title;
        this.description = description;
        this.modules = modules;
    }

    public void showCourseInfo() {
        System.out.println("=== Course Information ===");
        System.out.println("Title: " + title);
        System.out.println("Description: " + description);
        System.out.println("Modules: " + modules);
        System.out.println("==========================");
    }
}
