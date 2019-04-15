package com.robosh.states;

import com.robosh.TrainingGrant;

public interface TrainingGrantState {
    void confirmedGrant(TrainingGrant trainingGrant);
    void createdGrant(TrainingGrant trainingGrant);
    void postponedGrant(TrainingGrant trainingGrant);
    void rejectedGrant(TrainingGrant trainingGrant);
    void underReview(TrainingGrant trainingGrant);
    void withDrawnGrant(TrainingGrant trainingGrant);
}
