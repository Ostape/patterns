package com.robosh;

import com.robosh.players.BotPlayer;
import com.robosh.players.HumanPlayer;

public class Runner {
    public static void main(String[] args) {
        Board board = new Board();
        BotPlayer botPlayer = new BotPlayer("easy", 'X', board);
        HumanPlayer humanPlayer = new HumanPlayer('O', board);

        do {
            botPlayer.input();
            System.out.println();
            System.out.println(board);
            System.out.println();
            humanPlayer.input();
            System.out.println();
            System.out.println(board);
            System.out.println();
        }while (!board.winning('O' ) && !board.winning('X'));

    }
}
