package com.robosh;

import com.robosh.moves.Fly;
import com.robosh.moves.FlyWalk;
import com.robosh.moves.Walk;

import java.util.ArrayList;
import java.util.List;

public class MainGame {
    public static void main(String[] args) {
        List<StrategyHero> strategyHeroes = new ArrayList<StrategyHero>();

        StrategyHero firstHero = new StrategyHero("орки");
        StrategyHero secondHero = new StrategyHero("пегасы");
        StrategyHero thirdHero = new StrategyHero("гарпии ");

        firstHero.setStrategyAction(new Walk());
        secondHero.setStrategyAction(new FlyWalk());
        thirdHero.setStrategyAction(new Fly());

        System.out.println(firstHero);
        firstHero.executeStratagy();

        System.out.println(secondHero);
        secondHero.executeStratagy();

        System.out.println(thirdHero);
        thirdHero.executeStratagy();


        firstHero.makeMagic(true);
        System.out.println(firstHero);
        firstHero.executeStratagy();
    }
}
