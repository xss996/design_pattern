package com.xss.design_pattern.template_pattern;

public abstract class AbstractClass {
    //模板方法
    public void start() {
        getNumber();
        lineUp();
        doSomething();
        appraise();
    }

    //基本方法
    public void getNumber() {
        System.out.println("银行取号");
    }

    public void lineUp() {
        System.out.println("银行排队");
    }

    public void appraise() {
        System.out.println("银行评价");
    }

    public abstract void doSomething();

}
