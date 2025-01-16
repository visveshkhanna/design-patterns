package com.example.edtech.abstractfactory;

public class TextMaterial implements CourseMaterial {
    private String textContent;

    public TextMaterial(String textContent) {
        this.textContent = textContent;
    }

    @Override
    public void displayContent() {
        System.out.println("Showing text: " + textContent);
    }
}
