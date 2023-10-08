package com.xss.design_pattern.builder_pattern;

import com.xss.design_pattern.builder_pattern.entity.Lego;

/**
 * 抽象建造者
 * 建造乐高模型的接口，规定创建人型乐高模型的规范
 */
public interface BuilderLego {
    //创建头部
    void buildHead();

    //创建躯干
    void buildBody();

    //创建手部
    void buildHand();

    //创建脚部
    void buildFoot();

    /**
     * 返回创建的乐高模型
     */
    Lego getLego();
}
