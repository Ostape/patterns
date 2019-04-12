package com.robosh.money;

public class ConvertMoney extends OperationModule {
    public void makeTransaction(Money money) {
        double dollars = money.getAmount()/27.;
        if (dollars > 0.01){
            System.out.println("your money converted to dollars: " + dollars);
        }
        else {
            System.out.println("not enough money to convert into dollars");
        }
        if (dollars > 0.01 && next != null){
            next.makeTransaction(new Money(dollars));
        }
    }
}
