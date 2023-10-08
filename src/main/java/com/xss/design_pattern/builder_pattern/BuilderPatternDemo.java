package com.xss.design_pattern.builder_pattern;

import com.xss.design_pattern.builder_pattern.entity.GunDamLego;
import com.xss.design_pattern.builder_pattern.entity.IronManLego;
import com.xss.design_pattern.builder_pattern.entity.Lego;

public class BuilderPatternDemo {
    public static void main(String[] args) {
        LegoDirector director = new LegoDirector();
        Lego ironManLego = director.createLego(new IronManLego());
        System.out.println(ironManLego);
        Lego gunDamLego = director.createLego(new GunDamLego());
        System.out.println(gunDamLego);
    }
}
