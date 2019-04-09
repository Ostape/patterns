package com.robosh.composite.leafObjects;

import com.robosh.composite.BaseComponent.MathematicalOperation;

public class Plus implements MathematicalOperation {

    public int operation(String a1, String a2){
        return Integer.parseInt(a1) + Integer.parseInt(a2);
    }
}
