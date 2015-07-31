package com.rover;

import java.util.Scanner;

public class View {
    public void display(String s) {
        System.out.println(s);
    }

    public String acceptInput() {
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();
    }
}