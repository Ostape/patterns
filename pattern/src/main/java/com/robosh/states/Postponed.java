package com.robosh.states;

import com.robosh.TrainingGrant;

public class Postponed implements TrainingGrantState {

    public void confirmedGrant(TrainingGrant trainingGrant) {

    }

    public void createdGrant(TrainingGrant trainingGrant) {

    }

    public void postponedGrant(TrainingGrant trainingGrant) {
        trainingGrant.setTrainingGrantState(new Withdrawn());
        System.out.println("Grant postponed");
    }

    public void rejectedGrant(TrainingGrant trainingGrant) {

    }

    public void underReview(TrainingGrant trainingGrant) {

    }

    public void withDrawnGrant(TrainingGrant trainingGrant) {

    }
}
