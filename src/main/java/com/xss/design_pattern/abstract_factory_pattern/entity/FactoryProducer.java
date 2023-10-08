package com.xss.design_pattern.abstract_factory_pattern.entity;

import com.xss.design_pattern.abstract_factory_pattern.SmartProductFactory;
import org.springframework.util.StringUtils;

public class FactoryProducer {
    public static SmartProductFactory getFactory(String brandName) {
        if (!StringUtils.hasLength(brandName)) {
            return null;
        }
        if ("HUAWEI".equalsIgnoreCase(brandName)) {
            return new HuaweiFactory();
        }
        if ("XIAOMI".equalsIgnoreCase(brandName)) {
            return new XiaomiFactory();
        }
        return null;
    }

}
