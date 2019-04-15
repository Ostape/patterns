package com.robosh.states;

import com.robosh.TrainingGrant;

public class Confirmed implements TrainingGrantState {

    public void confirmedGrant(TrainingGrant trainingGrant) {
        trainingGrant.setTrainingGrantState(new Rejected());
        System.out.println("Grand confirmed");
    }

    public void createdGrant(TrainingGrant trainingGrant) {

    }

    public void postponedGrant(TrainingGrant trainingGrant) {

    }

    public void rejectedGrant(TrainingGrant trainingGrant) {

    }

    public void underReview(TrainingGrant trainingGrant) {

    }

    public void withDrawnGrant(TrainingGrant trainingGrant) {

    }
}
