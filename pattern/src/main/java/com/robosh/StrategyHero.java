package com.robosh;

import com.robosh.moves.Fly;
import com.robosh.moves.StrategyAction;

public class StrategyHero {
    private StrategyAction strategyAction;
    private String name;
    private boolean magic;

    public StrategyHero(String name){
        this.name = name;
    }

    public void setStrategyAction(StrategyAction strategyAction) {
        this.strategyAction = strategyAction;
    }

    public void executeStratagy() {
        strategyAction.makeAction();
    }

    public void makeMagic(boolean magic){
        this.magic = magic;
        if (magic){
            strategyAction = new Fly();
        }
    }

    @Override
    public String toString() {
        return "StrategyHero{" +
                ", name='" + name + '\'' +
                ", magic=" + magic +
                '}';
    }
}
