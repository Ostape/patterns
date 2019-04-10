package com.robosh;

import com.robosh.states.Created;
import com.robosh.states.TrainingGrant;

public class OrderApp {
    public static void main(String[] args) {
        OrderTrainingGrant orderTrainingGrant = new OrderTrainingGrant();
        TrainingGrant trainingGrant = new Created();
        orderTrainingGrant.setTrainingGrant(trainingGrant);

        for (int i = 0; i < 6; i++){
            orderTrainingGrant.showState();
            orderTrainingGrant.nextState();
        }
    }
}
