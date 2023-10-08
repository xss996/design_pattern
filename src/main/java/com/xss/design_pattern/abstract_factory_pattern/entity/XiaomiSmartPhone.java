package com.xss.design_pattern.abstract_factory_pattern.entity;

import com.xss.design_pattern.abstract_factory_pattern.ISmartPhone;

public class XiaomiSmartPhone implements ISmartPhone {
    @Override
    public void printInfo() {
        System.out.println("小米智能手机");
    }
}
