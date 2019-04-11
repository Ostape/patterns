package com.robosh;

public class Chloroflexi implements Bacteria {
    private int showParameter = 10;
    public void showBacteria(int yearsLife) {
        System.out.println("Chloroflexi  lives: " + yearsLife  + " and special parameter " + showParameter);
    }
}
