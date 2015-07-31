package com.rover;

public class Plateau {
    private int xCoOrdinate;
    private int yCoOrdinate;

    public Plateau(int xCoOrdinate, int yCoOrdinate) {
        this.xCoOrdinate = xCoOrdinate;
        this.yCoOrdinate = yCoOrdinate;
    }

    public int getTopRightXCoOrdinate() {
        return xCoOrdinate;
    }

    public int getTopRightYCoOrdinate() {
        return yCoOrdinate;
    }
}