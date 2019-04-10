package com.robosh;

public class Memento {
    private char[] state;

    public Memento(char[] state){
        this.state = state;
    }

    public char[] getBoard(){
        return state;
    }
}
