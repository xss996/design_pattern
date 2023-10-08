package com.xss.design_pattern.factory_pattern.entity;

import com.xss.design_pattern.factory_pattern.IProduceCar;

public class BMWCar implements IProduceCar {
    @Override
    public void productCars() {
        System.out.println("生产的是宝马汽车");
    }
}
