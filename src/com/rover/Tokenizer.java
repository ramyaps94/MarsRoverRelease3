package com.rover;

import java.util.ArrayList;

public class Tokenizer {
    public ArrayList<Integer> tokenizeStringToIntegerValue(String input) {
        ArrayList<Integer> plateauBoundary = new ArrayList<>();
        String boundary[] = input.split(" ");
        int boundaryX = Integer.parseInt(boundary[0]);
        int boundaryY = Integer.parseInt(boundary[1]);
        plateauBoundary.add(boundaryX);
        plateauBoundary.add(boundaryY);
        return plateauBoundary;
    }

}