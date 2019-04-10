package com.robosh.states;

import com.robosh.states.TrainingGrant;

public class Withdrawn implements TrainingGrant {
    public void showState() {
        System.out.println("Grant withdrawn");
    }
}
