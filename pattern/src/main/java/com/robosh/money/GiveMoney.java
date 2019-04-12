package com.robosh.money;

public class GiveMoney extends OperationModule {
    public void makeTransaction(Money money) {
        System.out.println("Money arrived to your addresser " + money.getAmount());
    }
}
