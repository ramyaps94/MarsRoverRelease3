package com.rover;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlateauTest {

    @Test
    public void shouldKnowTheTopRightX() {
        Plateau plateau = new Plateau(5, 5);

        int expectedX = 5;

        assertEquals(expectedX, plateau.getTopRightXCoOrdinate());
    }

    @Test
    public void shouldKnowTheTopRightY() {
        Plateau plateau = new Plateau(5, 5);

        int expectedY = 5;

        assertEquals(expectedY, plateau.getTopRightYCoOrdinate());
    }

    @Test
    public void shouldKnowTheBottomLeftX() {
        Plateau plateau = new Plateau(5, 5);

        int expectedX = 0;

        assertEquals(expectedX, plateau.getBottomLeftXCoOrdinate());
    }
}