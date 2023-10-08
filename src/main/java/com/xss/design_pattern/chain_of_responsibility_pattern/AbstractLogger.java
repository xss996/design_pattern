package com.xss.design_pattern.chain_of_responsibility_pattern;

public abstract class AbstractLogger {
    public static int INFO = 1;
    public static int WARN = 2;
    public static int ERROR = 3;

    protected int level;
    //责任链中的下一个元素
    protected AbstractLogger nextHandler;

    public void setNextHandler(AbstractLogger nextHandler) {
        this.nextHandler = nextHandler;
    }

    public void handleMessage(int level, String message) {
        //消息级别高于或等于所设置级别就打印消息
        if (level >= this.level) {
            write(message);
        }

        if (nextHandler != null) {
            nextHandler.handleMessage(level, message);
        }
    }

    protected abstract void write(String message);
}
