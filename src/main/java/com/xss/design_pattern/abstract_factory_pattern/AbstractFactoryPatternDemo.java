package com.xss.design_pattern.abstract_factory_pattern;

import com.xss.design_pattern.abstract_factory_pattern.entity.FactoryProducer;

public class AbstractFactoryPatternDemo {
    public static void main(String[] args) {
        SmartProductFactory factory = FactoryProducer.getFactory("xiaomi");
        ISmartCar car = factory.createCar();
        car.printInfo();
        ISmartPhone phone = factory.createPhone();
        phone.printInfo();
    }
}
