package com.xss.design_pattern.factory_pattern;

public class FactoryPatternDemo {
    public static void main(String[] args) {
        ProductCarFactory factory = new ProductCarFactory();
        IProduceCar produceCar = factory.getCarType("benz");
        produceCar.productCars();
    }
}
