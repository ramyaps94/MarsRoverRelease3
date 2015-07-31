package com.rover;

import java.util.ArrayList;

public class MarsRoverApplication {
    public static void main(String[] args) {
        View view = new View();
        Tokenizer tokenizer = new Tokenizer();
        ArrayList<Integer> plateauBoundary = new ArrayList<>();
        view.display("Enter the Boundaries of the Plateau");
        String Input = view.acceptInput();
        plateauBoundary = tokenizer.tokenizeStringToIntegerValueOfPlateauBoundaries(Input);
        view.display("Enter the current position of the rover");
        Input = view.acceptInput();
        view.display("Enter the controlling string to move the rover");
        Input = view.acceptInput();
    }
}