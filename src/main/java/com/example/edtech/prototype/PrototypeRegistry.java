package com.example.edtech.prototype;

import java.util.HashMap;
import java.util.Map;

/**
 * Stores and returns pre-made prototypes.
 */
public class PrototypeRegistry {
    private Map<String, PrototypeCourse> prototypes = new HashMap<>();

    public void addPrototype(String key, PrototypeCourse prototype) {
        prototypes.put(key, prototype);
    }

    public PrototypeCourse getPrototype(String key) {
        PrototypeCourse prototype = prototypes.get(key);
        return (prototype != null) ? prototype.clone() : null;
    }
}
