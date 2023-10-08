package com.xss.design_pattern.abstract_factory_pattern.entity;

import com.xss.design_pattern.abstract_factory_pattern.ISmartCar;

public class XiaomiSmartCar implements ISmartCar {
    @Override
    public void printInfo() {
        System.out.println("小米智能汽车");
    }
}
