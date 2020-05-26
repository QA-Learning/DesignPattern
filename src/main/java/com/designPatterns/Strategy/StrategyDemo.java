package com.designPatterns.Strategy;

public class StrategyDemo {
    public static void main(String args[]) {
        Context context = new Context(new OperationAdd());
        int addOperation = context.executeOperation(1, 2);
        System.out.println(addOperation);


        Context subContext = new Context(new OperationSub());
        int subOperation = subContext.executeOperation(2, 1);
        System.out.println(subOperation);
    }
}
