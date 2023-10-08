package com.xss.design_pattern.abstract_factory_pattern;

public interface SmartProductFactory {
    ISmartCar createCar();

    ISmartPhone createPhone();
}
