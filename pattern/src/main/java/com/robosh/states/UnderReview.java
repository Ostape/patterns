package com.robosh.states;

import com.robosh.states.TrainingGrant;

public class UnderReview implements TrainingGrant {
    public void showState() {
        System.out.println("Grant is under review");
    }
}
