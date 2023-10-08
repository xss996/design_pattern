package com.xss.design_pattern.abstract_factory_pattern.entity;

import com.xss.design_pattern.abstract_factory_pattern.ISmartCar;
import com.xss.design_pattern.abstract_factory_pattern.ISmartPhone;
import com.xss.design_pattern.abstract_factory_pattern.SmartProductFactory;

public class XiaomiFactory implements SmartProductFactory {
    @Override
    public ISmartCar createCar() {
        return new XiaomiSmartCar();
    }

    @Override
    public ISmartPhone createPhone() {
        return new XiaomiSmartPhone();
    }
}
