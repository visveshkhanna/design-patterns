package com.example.edtech.abstractfactory;

/**
 * Abstract Factory interface that provides methods
 * to create various course materials.
 */
public interface CourseMaterialFactory {
    CourseMaterial createVideoMaterial();
    CourseMaterial createTextMaterial();
    CourseMaterial createQuizMaterial();
}
