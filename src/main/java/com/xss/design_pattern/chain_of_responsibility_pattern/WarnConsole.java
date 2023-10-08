package com.xss.design_pattern.chain_of_responsibility_pattern;

public class WarnConsole extends AbstractLogger {
    public WarnConsole() {
        this.level = AbstractLogger.WARN;
    }

    @Override
    protected void write(String message) {
        System.out.println("[Warn Console] - " + message);
    }
}
