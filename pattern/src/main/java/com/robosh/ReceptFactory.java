package com.robosh;

public class ReceptFactory {
    private Recept recept;

    public ReceptFactory(Recept recept) {
        setRecept(recept);
    }

    public void setRecept(Recept recept) {
        this.recept = recept;
    }

    public Recept makeCopy(){
        return (Recept)recept.copy();
    }
}
