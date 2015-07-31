package com.rover;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RoverTest {

    @Test
    public void shouldKnowThePositionOfTheRover() {
        Rover rover = new Rover(1,2,'N');

        assertEquals(rover ,rover.getRoversPosition());
    }

    @Test
    public void shouldKnowWhetherRoverIsWithinPlateau() {
        Rover rover = new Rover(1,2,'N');
        Plateau plateau = new Plateau(5, 5);

        assertEquals(true ,rover.IsRoverIsWithinThePlateau(plateau));
    }
}