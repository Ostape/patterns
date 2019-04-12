package com.robosh.composite;

import java.util.ArrayList;
import java.util.List;

public class Composite implements MathOperation {
    private List<MathOperation> components = new ArrayList<MathOperation>();
//private MathOperation components;

    public void addComponent(MathOperation component){
        components.add(component);
        //components = component;
    }

    public void removeComponent(MathOperation component){
        components.remove(component);
    }
    public MathOperation getMathOperation(int num){
        return components.get(num);
    }

    public int executeOperation() {
        int k = 0;
        for (MathOperation mathOperation : components){
            k += mathOperation.executeOperation();
        }
        return k;
    }
}
