package com.sun.design.strategy;

public class StrategyDesign {

    public static void main(String[] args) {
        OperationContext context = new OperationContext(new SumOperationImpl());
        int res = context.calOperation(1,2);
        System.out.print(String.valueOf(res));
    }


}