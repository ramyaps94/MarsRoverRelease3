package com.rover;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class TokenizerTest {

    @Test
    public void shouldBeToTokenizeTheInputOfPlateauBoundary() {
        Tokenizer tokenizer = new Tokenizer();

        ArrayList<Integer> ActualValue = tokenizer.tokenizeStringToIntegerValueOfPlateauBoundaries("5 5");

        assertEquals(Arrays.asList(5, 5), ActualValue);
    }
}