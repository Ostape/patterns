package com.robosh;

import com.robosh.players.BotPlayer;
import com.robosh.players.HumanPlayer;

import java.util.Random;


public class Runner {
    public static void main(String[] args) {
       new Runner().run();
    }

    private void run(){
        Random random = new Random(49);
        Board board = new Board();
        BotPlayer botPlayer = new BotPlayer('X');
        HumanPlayer humanPlayer = new HumanPlayer('O');

        CareTaker careTaker = new CareTaker();
        careTaker.save(board);


        do {
            botPlayer.generateEasy(board);
            show(board);
            if (board.winning('X')){
                break;
            }
            if (random.nextInt(3) == 1){
                System.out.println("Changed");
                careTaker.undo(board);
                show(board);
            }
            careTaker.save(board);
            humanPlayer.inputHuman(board);
            show(board);

        }while (!board.winning('O' ) && !board.winning('X'));

    }

    private void show(Board board){
        System.out.println();
        System.out.println(board);
        System.out.println();
    }

}
