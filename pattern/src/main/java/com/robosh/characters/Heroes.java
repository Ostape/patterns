package com.robosh.characters;

    
import com.robosh.moves.Fly;
import com.robosh.moves.StrategyAction;

public abstract class Heroes {
    private String heroName;
    private StrategyAction strategyAction;
    private boolean magic;

    public Heroes(String heroName, StrategyAction strategyAction) {
        this.heroName = heroName;
        this.strategyAction = strategyAction;
    }

    public String getHeroName() {
        return heroName;
    }

    public void setHeroName(String heroName) {
        this.heroName = heroName;
    }

    public StrategyAction getStrategyAction() {
        return strategyAction;
    }

    public void setStrategyAction(StrategyAction strategyAction) {
        this.strategyAction = strategyAction;
    }

    public boolean isMagic() {
        return magic;
    }

    public void setMagic(boolean magic) {
        this.magic = magic;
        if (magic){
            strategyAction = new Fly();
        }
    }

    public void showAction(){
        strategyAction.makeAction();
    }
}
