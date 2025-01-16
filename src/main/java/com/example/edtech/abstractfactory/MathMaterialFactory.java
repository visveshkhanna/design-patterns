package com.example.edtech.abstractfactory;

public class MathMaterialFactory implements CourseMaterialFactory {

    @Override
    public CourseMaterial createVideoMaterial() {
        return new VideoMaterial("Math Video Lecture");
    }

    @Override
    public CourseMaterial createTextMaterial() {
        return new TextMaterial("Math Text Content");
    }

    @Override
    public CourseMaterial createQuizMaterial() {
        return new QuizMaterial("Math Quiz");
    }
}
