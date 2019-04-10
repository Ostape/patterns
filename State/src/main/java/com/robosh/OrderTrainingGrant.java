package com.robosh;

import com.robosh.states.*;

public class OrderTrainingGrant {
    private TrainingGrant trainingGrant;

    public void setTrainingGrant(TrainingGrant trainingGrant) {
        this.trainingGrant = trainingGrant;
    }

    void nextState() {
        if (trainingGrant instanceof Created) {
            setTrainingGrant(new Confirmed());
        } else if (trainingGrant instanceof Confirmed) {
            setTrainingGrant(new Postponed());
        } else if (trainingGrant instanceof Postponed) {
            setTrainingGrant(new Rejected());
        } else if (trainingGrant instanceof Rejected) {
            setTrainingGrant(new UnderReview());
        } else if (trainingGrant instanceof UnderReview) {
            setTrainingGrant(new Withdrawn());
        } else if (trainingGrant instanceof Withdrawn) {
            setTrainingGrant(new Created());
        }
    }

    public void showState() {
        trainingGrant.showState();
    }
}
