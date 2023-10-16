package com.xss.design_pattern.decorator_pattern;

public class Circle implements Shape{
    @Override
    public void draw() {
        System.out.println("画一个圆");
    }
}
