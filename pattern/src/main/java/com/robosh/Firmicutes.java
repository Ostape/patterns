package com.robosh;

public class Firmicutes implements Bacteria {
    private String colony= "Mars";
    public void showBacteria(int yearsLife) {
        System.out.println("Firmicutes lives: " + yearsLife + ", it`s colony " + colony);
    }
}
