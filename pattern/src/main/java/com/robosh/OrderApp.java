package com.robosh;

import com.robosh.states.Created;

public class OrderApp {
    public static void main(String[] args) {
       TrainingGrant grant = new TrainingGrant(new Created(), "harvard grant");

       grant.create();
       grant.underReview();
       grant.postone();
       grant.withdrawn();
       grant.confirm();
       grant.reject();
    }
}
