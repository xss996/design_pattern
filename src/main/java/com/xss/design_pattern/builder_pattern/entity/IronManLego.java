package com.xss.design_pattern.builder_pattern.entity;

import com.xss.design_pattern.builder_pattern.BuilderLego;

/**
 * 钢铁侠乐高
 */
public class IronManLego implements BuilderLego {
    private Lego lego;

    public IronManLego() {
        //创建乐高对象
        lego = new Lego();
    }

    @Override
    public void buildHead() {
        lego.setHand("钢铁头盔(AI系统)");
    }

    @Override
    public void buildBody() {
        lego.setBody("钢铁战衣(集束炮)");
    }

    @Override
    public void buildHand() {
        lego.setHead("钢铁手套(电弧脉冲炮)");
    }

    @Override
    public void buildFoot() {
        lego.setFoot("钢铁战靴(推进器)");
    }

    @Override
    public Lego getLego() {
        return lego;
    }
}
