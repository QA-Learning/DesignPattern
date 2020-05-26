package com.designPatterns.Strategy;

public class OperationSub implements IStrategy {
    public int doOperation(int num1, int num2) {
        return num1 - num2;
    }
}
