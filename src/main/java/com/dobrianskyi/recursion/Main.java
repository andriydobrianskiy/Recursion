package com.dobrianskyi.recursion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        int value;
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println("Enter the number:");
            value = Integer.parseInt(reader.readLine());
            recusion(value, value);

        } catch (IOException | NumberFormatException e) {
            System.out.println("Enter the number");
        }
    }

    public static Boolean recusion(int value, int number) {
        if (value <= 0) {
            return false;
        }
        value = value - 1;
        System.out.println(number - (value));
        return recusion(value, number);
    }


}
