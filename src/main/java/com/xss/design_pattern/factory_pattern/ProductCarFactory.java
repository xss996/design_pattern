package com.xss.design_pattern.factory_pattern;

import com.xss.design_pattern.factory_pattern.entity.AudiCar;
import com.xss.design_pattern.factory_pattern.entity.BMWCar;
import com.xss.design_pattern.factory_pattern.entity.BenzCar;
import org.springframework.util.StringUtils;

public class ProductCarFactory {
    public IProduceCar getCarType(String carType) {
        if (!StringUtils.hasLength(carType)) {
            return null;
        }
        if ("BMW".equalsIgnoreCase(carType)) {
            return new BMWCar();
        }

        if ("BENZ".equalsIgnoreCase(carType)) {
            return new BenzCar();
        }
        if ("AUDI".equalsIgnoreCase(carType)) {
            return new AudiCar();
        }
        return null;
    }

}
