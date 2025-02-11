package com.designPatterns.Singleton;

public class Singleton {
    private static Singleton instance = null;

    public String s;

    private Singleton() {
        s = "Hello I am a string part of Singleton class";
    }

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }

        return instance;
    }
}
