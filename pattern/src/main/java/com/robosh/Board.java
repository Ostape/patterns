package com.robosh;

public class Board {

    public char []state;
    private final int cellStart = 0;
    private final int cellEnds = 9;

    public Board(){
        state =  new char[] {' ', ' ', ' ',
                ' ', ' ', ' ',
                ' ', ' ', ' '};
    }

    public boolean checkSell(int indexI){
        if(indexI < 0 || indexI > 8){
            System.out.println("Coordinates should be from 1 to 3!");
            return false;
        }
        if (state[indexI] != ' '){
            System.out.println("This cell is occupied! Choose another one!");
            return false;
        }
        return true;
    }

    public boolean winning(char player){
        int winSum = player * 3;
        return
            (state[0] + state[1] + state[2] == winSum) ||
            (state[3] + state[4] + state[5] == winSum) ||
            (state[6] + state[7] + state[8] == winSum) ||
            (state[0] + state[3] + state[6] == winSum) ||
            (state[1] + state[4] + state[7] == winSum) ||
            (state[2] + state[5] + state[8] == winSum) ||
            (state[0] + state[4] + state[8] == winSum) ||
            (state[2] + state[4] + state[6] == winSum);
    }

    public void addChar(char player, int index){
        state[index] = player;
    }

    public char getChar(int index){
        return state[index];
    }

    @Override
    public String toString() {
        StringBuilder string = new StringBuilder();
        string.append("---------\n");

        for (int i = cellStart; i < cellEnds; i++){

            if (i == 0 || i == 3 || i == 6){
                string.append("| ");
        }

            string.append(state[i]).append(" ");
            if (i == 2 || i == 5 || i == 8){
                string.append("|\n");
            }
        }

        string.append("---------\n");
        return string.toString();
    }

    public Memento save(){
        char []state2 = new char[9];
        for (int i = 0; i < 9; i++){
            state2[i] = state[i];
        }
        return new Memento(state2);
    }

    public void undoToLastSave(Object obj) {
        Memento memento = (Memento) obj;
        state = memento.getBoard();
    }
}

