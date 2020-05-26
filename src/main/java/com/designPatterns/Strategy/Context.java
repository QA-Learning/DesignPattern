package com.designPatterns.Strategy;

public class Context {
    public IStrategy iStrategy;

    Context(IStrategy iStrategy) {
        this.iStrategy = iStrategy;
    }

    public int executeOperation(int num1, int num2) {
        return this.iStrategy.doOperation(num1, num2);
    }
}
