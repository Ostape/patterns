package com.robosh.states;

import com.robosh.TrainingGrant;

public class UnderReview implements TrainingGrantState {

    public void confirmedGrant(TrainingGrant trainingGrant) {

    }

    public void createdGrant(TrainingGrant trainingGrant) {

    }

    public void postponedGrant(TrainingGrant trainingGrant) {

    }

    public void rejectedGrant(TrainingGrant trainingGrant) {

    }

    public void underReview(TrainingGrant trainingGrant) {
        trainingGrant.setTrainingGrantState(new Postponed());
        System.out.println("Grant is under review");
    }

    public void withDrawnGrant(TrainingGrant trainingGrant) {

    }
}
