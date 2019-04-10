package com.robosh;

import java.util.ArrayList;
import java.util.List;

public class PostalOffice implements Observed{

    List<String> newspapers = new ArrayList<String>();

    List<Observer> subsribers = new ArrayList<Observer>();

    public void addNewspaper(String newspaper){
        this.newspapers.add(newspaper);
        notifyObservers();
    }

    public void removeNewspapers(String newspaper){
        this.newspapers.remove(newspaper);
    }


    public void addObserver(Observer observer) {
        this.subsribers.add(observer);
    }

    public void removeObserver(Observer observer) {
        this.subsribers.remove(observer);
    }

    public void notifyObservers() {
        for (Observer observer : subsribers){
            observer.handleEvent(this.newspapers);
        }
    }
}
