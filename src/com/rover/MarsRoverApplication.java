package com.rover;

import java.util.ArrayList;

public class MarsRoverApplication {
    public static void main(String[] args) {
        View view = new View();
        Tokenizer tokenizer = new Tokenizer();
        char direction;
        ArrayList<Integer> XYCoOrdinates = new ArrayList<>();
        view.display("Enter the Boundaries of the Plateau");
        String Input = view.acceptInput();
        XYCoOrdinates = tokenizer.tokenizeStringToIntegerValue(Input);
        view.display("Enter the current position of the rover");
        Input = view.acceptInput();
        XYCoOrdinates = tokenizer.tokenizeStringToIntegerValue(Input);
        direction = Input.charAt(4);
        Rover rover = new Rover(XYCoOrdinates.get(0), XYCoOrdinates.get(1), direction);
        view.display("Enter the controlling string to move the rover");
        Input = view.acceptInput();

    }
}