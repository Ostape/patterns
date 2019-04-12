package com.robosh.money;

public abstract class OperationModule {
    protected OperationModule next;

    public abstract void makeTransaction(Money money);

    public void setNextOperationModule(OperationModule module){
        next = module;
    }
}
