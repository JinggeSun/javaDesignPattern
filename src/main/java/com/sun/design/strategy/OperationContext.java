package com.sun.design.strategy;

public class OperationContext {

    private OperationInterface operationInterface;

    public OperationContext (OperationInterface operationInterface){
        this.operationInterface = operationInterface;
    }

    public int calOperation(int res1,int res2){
        return operationInterface.opeeation(res1,res2);
    }

}
