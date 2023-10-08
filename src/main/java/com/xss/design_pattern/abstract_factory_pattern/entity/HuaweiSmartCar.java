package com.xss.design_pattern.abstract_factory_pattern.entity;

import com.xss.design_pattern.abstract_factory_pattern.ISmartCar;

public class HuaweiSmartCar implements ISmartCar {
    @Override
    public void printInfo() {
        System.out.println("华为智能汽车");
    }
}
