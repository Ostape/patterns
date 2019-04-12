package com.robosh.money;

public class TakeMoney extends OperationModule {
    public void makeTransaction(Money money) {
        if (money.getAmount() >= 1 && money.getAmount() <= 1000000) {
            System.out.println("Money sent...");
        }
        else {
            System.out.println("We can`t operate more than one billion dollars and less than one!");
        }

        if (money.getAmount() >= 1 && money.getAmount() <= 1000000 && next != null){
            next.makeTransaction(money);
        }
    }
}
