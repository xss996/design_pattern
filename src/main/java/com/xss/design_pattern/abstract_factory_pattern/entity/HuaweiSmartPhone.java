package com.xss.design_pattern.abstract_factory_pattern.entity;

import com.xss.design_pattern.abstract_factory_pattern.ISmartPhone;

public class HuaweiSmartPhone implements ISmartPhone {
    @Override
    public void printInfo() {
        System.out.println("华为智能手机");
    }
}
