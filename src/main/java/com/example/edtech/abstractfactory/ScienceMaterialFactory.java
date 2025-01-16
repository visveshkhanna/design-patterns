package com.example.edtech.abstractfactory;

public class ScienceMaterialFactory implements CourseMaterialFactory {

    @Override
    public CourseMaterial createVideoMaterial() {
        return new VideoMaterial("Science Video Lecture");
    }

    @Override
    public CourseMaterial createTextMaterial() {
        return new TextMaterial("Science Text Content");
    }

    @Override
    public CourseMaterial createQuizMaterial() {
        return new QuizMaterial("Science Quiz");
    }
}
