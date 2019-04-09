package com.robosh.players;

import com.robosh.Board;

import java.util.Random;

public class BotPlayer extends Player {

    private Random random;
    private String level;


    public BotPlayer(String level, char XO, Board board){
        random = new Random();
        this.level = level;
        this.board = board;
        this.XO = XO;
    }

    public void input() {
        switch (level){
            case "easy":
                generateEasy();
                break;

            case "medium":
                break;

            case "hard":
                break;

        }
    }

    private void generateEasy(){
        System.out.println("Making move level \"easy\"");
        do {
            int randI = random.nextInt(9);
            if(board.getChar(randI) == ' '){
                board.addChar(XO, randI);
                break;
            }
        }while (true);
    }

//
//    public int generateMedium(){
//        System.out.println("Making move level \"medium\"");
//        int cell1 = ' ' + 'X' + 'X';
//        int cell2 = ' ' + 'O' + 'O';
//        int n = 3;
//        point:
//        do {
//            int sumD1 = 0;
//            int sumD2 = 0;
//            for (int i = 0; i < n; i++){
//                for (int j = 0; j < n; j++){
//                    if (i == j) {
//                        sumD1 += state[i][j];
//                    }
//                    if (i + j == 2){
//                        sumD2 += state[i][j];
//                    }
//                }
//            }
//            if (sumD1 == cell1 || sumD1 == cell2){
//                for (int i = 0; i < n;i++){
//                    if (state[i][i] == ' '){
//                        state[i][i] = XO;
//                        break point;
//                    }
//                }
//            }else if (sumD2 == cell1 || sumD2 == cell2){
//                for (int i = 0; i < n; i++){
//                    for (int j = 0; j < n; j++){
//                        if (i + j == 2 && state[i][j] == ' '){
//                            state[i][j] = XO;
//                            break point;
//                        }
//                    }
//                }
//            }
//
//
//
//
//            for (int i = 0; i < n; i++){
//                int sum1 = 0, sum2 = 0;
//
//                for (int j = 0; j < n; j++) {
//                    sum1 += state[i][j];
//                    sum2 += state[j][i];
//                }
//
//                if (sum1 == cell1 || sum1 == cell2){
//                    for (int j = 0; j < n; j++){
//                        if (state[i][j] == ' '){
//                            state[i][j] = XO;
//                            break point;
//                        }
//                    }
//                }
//                else if(sum2 == cell1 || sum2 == cell2){
//                    for (int j = 0; j < n; j++){
//                        if (state[j][i] == ' '){
//                            state[j][i] = XO;
//                            break point;
//                        }
//                    }
//                }
//            }
//
//            int randI = random.nextInt(3);
//            int randJ = random.nextInt(3);
//
//            if(state[randI][randJ] == ' '){
//                state[randI][randJ] = XO;
//                break;
//            }
//        }while (true);
//    }
//
//
}
