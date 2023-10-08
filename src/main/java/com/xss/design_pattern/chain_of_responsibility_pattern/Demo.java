package com.xss.design_pattern.chain_of_responsibility_pattern;

public class Demo {
    public static void main(String[] args) {
        ErrorConsole errorConsole = new ErrorConsole();
        InfoConsole infoConsole = new InfoConsole();
        WarnConsole warnConsole = new WarnConsole();
        errorConsole.setNextHandler(warnConsole);
        warnConsole.setNextHandler(infoConsole);

        //统一由责任链的链头接收请求，分别测试三种类型的信息
        errorConsole.handleMessage(AbstractLogger.INFO, "INFO:正常信息");
        System.out.println();

        errorConsole.handleMessage(AbstractLogger.WARN, "WARN:警告信息");
        System.out.println();

        errorConsole.handleMessage(AbstractLogger.ERROR, "ERROR:错误消息");
    }
}
