package com.xss.design_pattern.factory_pattern.entity;

import com.xss.design_pattern.factory_pattern.IProduceCar;

public class BenzCar implements IProduceCar {
    @Override
    public void productCars() {
        System.out.println("生产的是奔驰汽车");
    }
}
