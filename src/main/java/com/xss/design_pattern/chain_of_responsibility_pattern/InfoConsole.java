package com.xss.design_pattern.chain_of_responsibility_pattern;

public class InfoConsole extends AbstractLogger {
    public InfoConsole() {
        this.level = AbstractLogger.INFO;
    }

    @Override
    protected void write(String message) {
        System.out.println("[Info Console] - " + message);
    }
}
