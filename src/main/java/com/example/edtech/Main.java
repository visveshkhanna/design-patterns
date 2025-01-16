package com.example.edtech;

import com.example.edtech.singleton.PlatformManager;
import com.example.edtech.factorymethod.*;
import com.example.edtech.abstractfactory.*;
import com.example.edtech.builder.*;
import com.example.edtech.prototype.*;

public class Main {

    public static void main(String[] args) {
        // ============= SINGLETON =============
        PlatformManager manager = PlatformManager.getInstance();
        manager.displayWelcomeMessage();

        // ============= FACTORY METHOD =============
        System.out.println("\n--- Factory Method Pattern ---");
        CourseFactory mathFactory = new MathCourseFactory();
        mathFactory.enroll("Alice");

        CourseFactory scienceFactory = new ScienceCourseFactory();
        scienceFactory.enroll("Bob");

        // ============= ABSTRACT FACTORY =============
        System.out.println("\n--- Abstract Factory Pattern ---");
        CourseMaterialFactory mathMaterialFactory = new MathMaterialFactory();
        CourseMaterial mathVideo = mathMaterialFactory.createVideoMaterial();
        CourseMaterial mathText = mathMaterialFactory.createTextMaterial();
        CourseMaterial mathQuiz = mathMaterialFactory.createQuizMaterial();

        // Display the different course materials
        mathVideo.displayContent();
        mathText.displayContent();
        mathQuiz.displayContent();

        CourseMaterialFactory scienceMaterialFactory = new ScienceMaterialFactory();
        CourseMaterial sciVideo = scienceMaterialFactory.createVideoMaterial();
        CourseMaterial sciText = scienceMaterialFactory.createTextMaterial();
        CourseMaterial sciQuiz = scienceMaterialFactory.createQuizMaterial();

        sciVideo.displayContent();
        sciText.displayContent();
        sciQuiz.displayContent();

        // ============= BUILDER =============
        System.out.println("\n--- Builder Pattern ---");
        CourseBuilder builder = new CourseBuilder();
        CourseDirector director = new CourseDirector(builder);

        BuiltCourse basicCourse = director.constructBasicCourse();
        basicCourse.showCourseInfo();

        BuiltCourse advancedCourse = director.constructAdvancedCourse();
        advancedCourse.showCourseInfo();

        // ============= PROTOTYPE =============
        System.out.println("\n--- Prototype Pattern ---");
        PrototypeRegistry registry = new PrototypeRegistry();

        PrototypeCourse defaultMathPrototype = new PrototypeCourse("Math Prototype", "Basic Math Content", "Author1");
        PrototypeCourse defaultSciPrototype = new PrototypeCourse("Science Prototype", "Basic Science Content", "Author2");

        // Add prototypes to the registry
        registry.addPrototype("MATH_101", defaultMathPrototype);
        registry.addPrototype("SCI_101", defaultSciPrototype);

        // Retrieve clones from the registry
        PrototypeCourse clonedMathCourse = registry.getPrototype("MATH_101");
        PrototypeCourse clonedSciCourse = registry.getPrototype("SCI_101");

        if (clonedMathCourse != null) {
            System.out.println("Cloned Math Course Title: " + clonedMathCourse.getCourseTitle());
            System.out.println("Cloned Math Course Content: " + clonedMathCourse.getContent());
        }

        if (clonedSciCourse != null) {
            System.out.println("Cloned Science Course Title: " + clonedSciCourse.getCourseTitle());
            System.out.println("Cloned Science Course Content: " + clonedSciCourse.getContent());
        }

        System.out.println("\nAll patterns demonstrated successfully!");
    }
}
