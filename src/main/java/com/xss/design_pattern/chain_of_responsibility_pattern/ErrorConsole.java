package com.xss.design_pattern.chain_of_responsibility_pattern;

public class ErrorConsole extends AbstractLogger {

    public ErrorConsole() {
        this.level = AbstractLogger.ERROR;
    }

    @Override
    protected void write(String message) {
        System.out.println("[Error Console] - " + message);
    }
}
