package com.robosh;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MainRunner {
    public static void main(String[] args) {
        BacteriaFactory bacteriaFactory = new BacteriaFactory();

        List<Bacteria> bacterias = new ArrayList<>();

        bacterias.add(bacteriaFactory.getBacteria("Actinobacteria"));
        bacterias.add(bacteriaFactory.getBacteria("Chloroflexi"));
        bacterias.add(bacteriaFactory.getBacteria("Chloroflexi"));
        bacterias.add(bacteriaFactory.getBacteria("Firmicutes"));
        bacterias.add(bacteriaFactory.getBacteria("Actinobacteria"));
        bacterias.add(bacteriaFactory.getBacteria("Spirochaetes"));
        bacterias.add(bacteriaFactory.getBacteria("Spirochaetes"));
        bacterias.add(bacteriaFactory.getBacteria("Firmicutes"));

        Random rand = new Random();

        for (Bacteria bacteria : bacterias){
            int yearsOfLife = rand.nextInt(100);
            bacteria.showBacteria(yearsOfLife);
        }
    }
}
