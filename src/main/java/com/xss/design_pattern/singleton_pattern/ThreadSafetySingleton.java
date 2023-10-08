package com.xss.design_pattern.singleton_pattern;

public class ThreadSafetySingleton {
    private static volatile ThreadSafetySingleton instance = null;

    private ThreadSafetySingleton() {

    }

    public static ThreadSafetySingleton getInstance() {
        if (instance == null) {
            synchronized (ThreadSafetySingleton.class) {
                if (instance == null) {
                    instance = new ThreadSafetySingleton();
                }
            }
        }
        return instance;
    }
}
