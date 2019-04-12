package com.robosh.composite;

public class Digit implements MathOperation {

    private int number;

    public Digit(int number) {
        this.number = number;
    }

    public int executeOperation() {
        return number;
    }
}
