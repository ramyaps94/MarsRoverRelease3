package com.rover;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class ViewTest {
    private ByteArrayOutputStream outputContent = new ByteArrayOutputStream();
    PrintStream original;

    @Before
    public void setsUpStream() {
        System.setOut(new PrintStream(outputContent));
        original = System.out;
    }

    @After
    public void cleansUpStream() {
        System.setOut(original);
    }

    @Test
    public void shouldKnowTheOutputGivenOnScreen() {
        View view = new View();
        view.display("Enter the Boundaries of the Plateau");
        String message = "Enter the Boundaries of the Plateau\n";

        assertEquals(message, outputContent.toString());
    }
}