package com.rover;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RoverTest {

    @Test
    public void shouldReturnThePositionOfTheRover() {
        Rover rover = new Rover(1,2,'N');

        assertEquals(rover ,rover.getRoversPosition());
    }
}