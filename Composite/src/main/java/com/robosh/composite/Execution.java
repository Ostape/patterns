package com.robosh.composite;

import com.robosh.composite.BaseComponent.MathematicalOperation;

import java.util.ArrayList;
import java.util.List;

public class Execution implements MathematicalOperation {
    private List<MathematicalOperation> mathOperation;

    public Execution() {
        mathOperation = new ArrayList<MathematicalOperation>();
    }

    public int operation(String a1, String a2){
        return 1;
    }

    public void addMathOperation(MathematicalOperation operation){
        mathOperation.add(operation);
    }

    public void removeMathOperation(MathematicalOperation operation){
        mathOperation.remove(operation);
    }
}
