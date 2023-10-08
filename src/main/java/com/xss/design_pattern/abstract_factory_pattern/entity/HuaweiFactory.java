package com.xss.design_pattern.abstract_factory_pattern.entity;

import com.xss.design_pattern.abstract_factory_pattern.ISmartCar;
import com.xss.design_pattern.abstract_factory_pattern.ISmartPhone;
import com.xss.design_pattern.abstract_factory_pattern.SmartProductFactory;

public class HuaweiFactory implements SmartProductFactory {
    @Override
    public ISmartCar createCar() {
        return new HuaweiSmartCar();
    }

    @Override
    public ISmartPhone createPhone() {
        return new HuaweiSmartPhone();
    }
}
