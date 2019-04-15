package com.robosh.states;

import com.robosh.TrainingGrant;

public class Withdrawn implements TrainingGrantState {

    public void confirmedGrant(TrainingGrant trainingGrant) {

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
        trainingGrant.setTrainingGrantState(new Confirmed());
        System.out.println("Grant withdrawn");
    }
}
