package com.xss.design_pattern.decorator_pattern;

public class DecoratorPatternDemo {
    public static void main(String[] args) {
        RedShapeDecorator redCircle = new RedShapeDecorator(new Circle());
        RedShapeDecorator redRectangle = new RedShapeDecorator(new Rectangle());

        redCircle.draw();
        redRectangle.draw();
    }
}
