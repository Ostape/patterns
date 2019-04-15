package com.robosh.states;

import com.robosh.TrainingGrant;

public class Rejected implements TrainingGrantState {

    public void confirmedGrant(TrainingGrant trainingGrant) {
    }

    public void createdGrant(TrainingGrant trainingGrant) {
    }

    public void postponedGrant(TrainingGrant trainingGrant) {
    }

    public void rejectedGrant(TrainingGrant trainingGrant) {
        System.out.println("Grant rejected");
    }

    public void underReview(TrainingGrant trainingGrant) {

    }

    public void withDrawnGrant(TrainingGrant trainingGrant) {

    }
}
