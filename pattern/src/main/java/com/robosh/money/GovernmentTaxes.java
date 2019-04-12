package com.robosh.money;

public class GovernmentTaxes extends OperationModule {

    private double taxesPercent = 5./100.;

    public void makeTransaction(Money money) {
        double countMoney = money.getAmount() * taxesPercent;
        if (countMoney > 0.10){
            System.out.println("Government Taxes took " + countMoney + " UAH from your transaction");
        }
        else {
            System.out.println("All your money took government");
        }

        if (countMoney > 0.10 && next != null){
            next.makeTransaction(new Money(money.getAmount() - countMoney));
        }
    }
}
