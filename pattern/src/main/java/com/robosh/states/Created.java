package com.robosh.states;

import com.robosh.TrainingGrant;

public class Created implements TrainingGrantState {


    public void confirmedGrant(TrainingGrant trainingGrant) {
    }

    public void createdGrant(TrainingGrant trainingGrant) {
        trainingGrant.setTrainingGrantState(new UnderReview());
        System.out.println("Grant created");
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
