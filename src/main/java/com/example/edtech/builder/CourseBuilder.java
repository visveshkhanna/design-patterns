package com.example.edtech.builder;

import java.util.ArrayList;
import java.util.List;

/**
 * Builder pattern for constructing a complex Course object step by step.
 */
public class CourseBuilder {
    private String title;
    private String description;
    private List<String> modules = new ArrayList<>();

    public CourseBuilder setTitle(String title) {
        this.title = title;
        return this; // return the builder for chaining
    }

    public CourseBuilder setDescription(String description) {
        this.description = description;
        return this;
    }

    public CourseBuilder addModule(String module) {
        this.modules.add(module);
        return this;
    }

    public BuiltCourse build() {
        return new BuiltCourse(title, description, modules);
    }
}
