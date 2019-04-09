package com.robosh;

public class Tetris {
    public static void main(String[] args) {
        Realization realization =new Realization();

        int count = 10;
        do {
            count--;
            realization.startRandom(count != 0);
        }while (count != 0);
    }
}
