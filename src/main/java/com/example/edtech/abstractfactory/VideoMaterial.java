package com.example.edtech.abstractfactory;

public class VideoMaterial implements CourseMaterial {
    private String title;

    public VideoMaterial(String title) {
        this.title = title;
    }

    @Override
    public void displayContent() {
        System.out.println("Playing video: " + title);
    }
}
