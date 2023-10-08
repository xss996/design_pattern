package com.xss.design_pattern.singleton_pattern;

public class LazySingleton {
    private LazySingleton() {
    }

    public static LazySingleton instance = null;

    public static LazySingleton getInstance() {
        if (instance == null) {
            instance= new LazySingleton();
        }
        return instance;
    }
}
