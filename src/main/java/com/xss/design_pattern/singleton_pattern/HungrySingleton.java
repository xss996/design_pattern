package com.xss.design_pattern.singleton_pattern;

/**
 * 饿汉式
 */
public class HungrySingleton {
    private HungrySingleton() {
    }

    public static HungrySingleton instance = new HungrySingleton();

    public HungrySingleton getInstance() {
        return instance;
    }
}
