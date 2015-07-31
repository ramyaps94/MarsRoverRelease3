package com.rover;

public class Rover {
    private int xCoOrdinate;
    private int yCoOrdinate;
    private char direction;
    public Rover(int xCoOrdinate, int yCoOrdinate, char direction) {
        this.xCoOrdinate = xCoOrdinate;
        this.yCoOrdinate = yCoOrdinate;
        this.direction = direction;
    }
    public Rover getRoversPosition() {
        return this;
    }
}