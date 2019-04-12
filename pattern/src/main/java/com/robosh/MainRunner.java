package com.robosh;

import com.robosh.composite.*;

public class MainRunner {
    public static void main(String[] args) {

        //(1+2)*4+5*(3+6) = 57
        int k = composite(1, 2, 4, 5, 3, 6);
        System.out.println(k);
    }

    private static int composite(int a, int b, int c, int d, int e, int m) {
        MathOperation mathOperation = new Plus(
            new Multiply(
                    new Plus(new Digit(a), new Digit(b)),
                    new Digit(c)
            ),

            new Multiply(
                    new Plus(new Digit(m), new Digit(e)),
                    new Digit(d)
            )
        );
        return mathOperation.executeOperation();
    }
}
