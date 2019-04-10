package com.robosh.players;

import com.robosh.Board;
import java.util.Scanner;

public class HumanPlayer  {

    private char XO;
    private Scanner scan;

    public HumanPlayer(char XO){
        scan = new Scanner(System.in);
        this.XO = XO;
    }

    public void inputHuman(Board board){
        int indexI;
        do{
            System.out.println("enter coordinates (integer)");
            String input = scan.nextLine();

            try {
                indexI = Integer.parseInt(input) - 1;
                if (board.checkSell(indexI)) {
                    break;
                }
            } catch (NumberFormatException e) {
                System.out.println("Wrong input");
            }

        } while (true);
        board.addChar(XO,indexI);
    }

}
