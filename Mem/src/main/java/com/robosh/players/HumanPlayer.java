package com.robosh.players;

import com.robosh.Board;

import java.util.Scanner;

public class HumanPlayer extends Player {

    private Scanner scan;

    public void input() {
        inputHuman();
    }

    public HumanPlayer(char XO, Board board){
        scan = new Scanner(System.in);
        this.XO = XO;
        this.board = board;
    }

    private void inputHuman(){
        int indexI;
        do{
            System.out.println("Enter the coordinates: ");

            while (!scan.hasNextInt()) {
                scan.nextLine();
                System.out.println("You should enter numbers!");
            }
            indexI =  scan.nextInt() - 1;
            scan.nextLine();
            if(board.checkSell(indexI)){
                break;
            }

        } while (true);
        board.addChar(XO,indexI);
    }
}
