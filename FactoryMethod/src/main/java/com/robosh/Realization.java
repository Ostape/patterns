package com.robosh;

import com.robosh.figures.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Realization {

    private Random random;
    private Figure figure;

    public Realization() {
        random = new Random();
    }

    public void startRandom(boolean dropping) {
        int randNumber = random.nextInt(10);

        if (randNumber == 3) {
            randNumber = random.nextInt(6) + 1;
            figure = superFigures(randNumber);
            System.out.println("\n"+ figure.getClass().getSimpleName());
            figure.show();
        } else {
            randNumber = random.nextInt(6) + 1;
            figure = normalFigures(randNumber);
            System.out.println("\n"+ figure.getClass().getSimpleName());
            figure.show();
        }
    }

    private Figure normalFigures(int select) {
        switch (select) {
            case 1:
                return new FigureI();

            case 2:
                return new FigureJ();

            case 3:
                return new FigureL();

            case 4:
                return new FigureO();

            case 5:
                return new FigureS();

            case 6:
                return new FigureT();

            case 7:
                return new FigureZ();

            default:
                return null;
        }
    }

    private Figure superFigures(int select) {
        switch (select) {
            case 1:
                return new SuperFigureI();

            case 2:
                return new SuperFigureJ();

            case 3:
                return new SuperFigureL();

            case 4:
                return new SuperFigureO();

            case 5:
                return new SuperFigureS();

            case 6:
                return new SuperFigureT();

            case 7:
                return new SuperFigureZ();

            default:
                return null;
        }
    }
}
