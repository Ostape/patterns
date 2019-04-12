package com.robosh;

public class Runner {
    public static void main(String[] args) {
        PostalOffice postalOffice = new PostalOffice();

        postalOffice.addNewspaper("Visnyk");
        postalOffice.addNewspaper("Pravda");

        Subscriber firstSubscriber = new Subscriber("Orest");
        Subscriber secontSubsriber = new Subscriber("Ostap");

        postalOffice.addObserver(firstSubscriber);
        postalOffice.addObserver(secontSubsriber);

        postalOffice.addNewspaper("TSN");

    }
}

