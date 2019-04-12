package com.robosh;

public class CareTaker {
    private Object obj;

    public void save(Board board){
        this.obj=board.save();
    }

    public void undo(Board board){
        board.undoToLastSave(obj);
    }
}
