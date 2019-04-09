package com.robosh.players;

import com.robosh.Board;

public abstract class Player {
    public char XO;
    public Board board;
    public abstract void input();
}
