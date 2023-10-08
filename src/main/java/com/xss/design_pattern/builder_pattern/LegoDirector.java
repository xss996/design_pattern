package com.xss.design_pattern.builder_pattern;

import com.xss.design_pattern.builder_pattern.entity.Lego;

/**
 * 乐高的指挥者
 */
public class LegoDirector {
    /**
     * 创建乐高对象里的的具体内容
     * @param builderLego
     * @return
     */
    public Lego createLego(BuilderLego builderLego){
        //创建头部
        builderLego.buildHead();
        //创建躯干
        builderLego.buildBody();
        //创建手部
        builderLego.buildHand();
        //创建脚部
        builderLego.buildFoot();
        //返回已构建完毕的乐高对象
        return builderLego.getLego();
    }

}
