package com.robosh;

import com.robosh.characters.Harpy;
import com.robosh.characters.Heroes;
import com.robosh.characters.Orc;
import com.robosh.characters.Witch;
import com.robosh.moves.Fly;
import com.robosh.moves.FlyWalk;
import com.robosh.moves.Walk;

public class MainGame {
    public static void main(String[] args) {
        Heroes firstHero = new Orc("Dido", new Walk());
        Heroes secondHero = new Witch("Yaga", new FlyWalk());
        Heroes thirdHero = new Harpy("Harpiya", new Fly());

        firstHero.showAction();
        secondHero.showAction();
        thirdHero.showAction();

        System.out.println("Can Orc flying?");
        firstHero.setMagic(true);
        System.out.print("Yes, it can ");
        firstHero.showAction();
    }
}
