package com.xss.design_pattern.template_pattern;

/**
 * 举例：例如去银行办理业务，需要取号，排队，办理具体业务，对工作人员评分，其中取号，排队，
 * 评分三个步骤不论是谁都是一样的，但是办理具体业务却因人而异，可能是存款，可能是取款，可以延迟到子类中实现。
 */
public class TemplatePatternDemo {
    public static void main(String[] args) {
        Deposit deposit = new Deposit();
        deposit.doSomething();
        Withdraw withdraw = new Withdraw();
        withdraw.doSomething();
    }
}
