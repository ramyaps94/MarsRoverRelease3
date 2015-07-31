package com.rover;

public class Plateau {
    private int xCoOrdinate;
    private int yCoOrdinate;
    private int bottomLeftXCoOrdinate = 0;
    private int bottomLeftYCoOrdinate = 0;

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

    public int getBottomLeftXCoOrdinate() {
        return bottomLeftXCoOrdinate;
    }

    public int getBottomLeftYCoOrdinate() {
        return bottomLeftYCoOrdinate;
    }
}