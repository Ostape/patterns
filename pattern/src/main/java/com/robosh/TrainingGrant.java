package com.robosh;

import com.robosh.states.*;

public class TrainingGrant {
    private TrainingGrantState trainingGrantState;
    private String grantName;

    public TrainingGrant(TrainingGrantState trainingGrantState, String grantName) {
        this.trainingGrantState = trainingGrantState;
        this.grantName = grantName;
    }

    public void setTrainingGrantState(TrainingGrantState trainingGrantState) {
        this.trainingGrantState = trainingGrantState;
    }

    public TrainingGrantState getTrainingGrantState() {
        return trainingGrantState;
    }

    public String getGrantName() {
        return grantName;
    }

    public void setGrantName(String grantName) {
        this.grantName = grantName;
    }


    public void create() {
        trainingGrantState.createdGrant(this);
    }

    public void confirm() {
        trainingGrantState.confirmedGrant(this);
    }

    public void postone() {
        trainingGrantState.postponedGrant(this);
    }

    public void reject() {
        trainingGrantState.rejectedGrant(this);
    }

    public void underReview() {
        trainingGrantState.underReview(this);
    }

    public void withdrawn() {
        trainingGrantState.withDrawnGrant(this);
    }

}
