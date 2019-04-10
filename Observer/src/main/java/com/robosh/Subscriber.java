package com.robosh;

import java.util.List;

public class Subscriber implements Observer{
    String name;

    public Subscriber(String name) {
        this.name = name;
    }


    public void handleEvent(List<String> newspapers) {
        System.out.println("Dear " + name + ", we have some new newspapers" + newspapers);
        System.out.println("===============================================");
    }
}
