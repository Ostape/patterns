package com.robosh;

public class Main {

    public static void main(String[] args) {
        Recept original = new Recept(2016, 3,12,"Bob", "Jack");
        System.out.println(original);

        ReceptFactory factory = new ReceptFactory(original);
        Recept recept2 = factory.makeCopy();
        recept2.changeDate(12, 3,2017);
        System.out.println(recept2);
    }

}
