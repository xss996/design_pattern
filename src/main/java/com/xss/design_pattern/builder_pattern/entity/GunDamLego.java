package com.xss.design_pattern.builder_pattern.entity;

import com.xss.design_pattern.builder_pattern.BuilderLego;

/**
 * 高达乐高
 */
public class GunDamLego implements BuilderLego {
    private Lego lego;

    public GunDamLego() {
        //创建乐高对象
        lego = new Lego();
    }

    @Override
    public void buildHead() {
        lego.setHand("高达头部(驾驶舱)");
    }

    @Override
    public void buildBody() {
        lego.setBody("高达躯干(大口径光束加农炮)");
    }

    @Override
    public void buildHand() {
        lego.setHead("高达手部(盾牌)");
    }

    @Override
    public void buildFoot() {
        lego.setFoot("高达腿部(推进器)");
    }

    @Override
    public Lego getLego() {
        return lego;
    }
}
