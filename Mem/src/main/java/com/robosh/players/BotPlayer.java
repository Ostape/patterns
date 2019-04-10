package com.robosh.players;

import com.robosh.Board;

import java.util.Random;

public class BotPlayer {

    private Random random;
    private char XO;

    public BotPlayer(char XO){
        random = new Random();
        this.XO = XO;
    }

    public void generateEasy(Board board){
        System.out.println("Making move level \"easy\"");
        do {
            int randI = random.nextInt(9);
            if(board.getChar(randI) == ' '){
                board.addChar(XO, randI);
                break;
            }
        }while (true);
    }

}
