package com.example.edtech.singleton;

/**
 * A singleton class that represents the platform manager for the EdTech system.
 * Ensures only one instance manages global platform configurations.
 */
public class PlatformManager {

    // Eager initialization (created at class load time).
    private static final PlatformManager instance;

    // Private constructor prevents external instantiation
    private PlatformManager() {
        System.out.println("PlatformManager initialized.");
    }

    public static PlatformManager getInstance() {
        if(instance == null) {
            instance = new PlatformManager(); 
        }
        return instance;
    }

    public void displayWelcomeMessage() {
        System.out.println("Welcome to the EdTech Platform!");
    }
}
