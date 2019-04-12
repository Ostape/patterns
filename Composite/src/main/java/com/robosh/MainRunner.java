package com.robosh;

import com.robosh.composite.*;

public class MainRunner {
    public static void main(String[] args) {
        Composite composite1 = new Composite();
        Composite composite2 = new Composite();

        composite1.addComponent(new Plus( new Digit(1),new Digit(5)));
        composite1.addComponent(new Multiply(new Digit(4), new Digit(5)));

        composite2.addComponent(new Plus(new Digit(3), new Digit(5)));
        composite2.addComponent(new Multiply(new Digit(1), new Digit(4)));

        Composite mainComposite = new Composite();
        mainComposite.addComponent(composite1);
        mainComposite.addComponent(composite2);

        int number = mainComposite.executeOperation();
        System.out.println(number);
    }

    private Composite getNumber(){

    }
}
