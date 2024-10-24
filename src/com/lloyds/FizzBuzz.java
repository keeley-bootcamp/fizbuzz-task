package com.lloyds;

import java.util.InputMismatchException;
import java.util.Scanner;

public class FizzBuzz {
    public static void fizzBuzz() {
        int maxValue = readUserValue();
        if (maxValue >= 1 && maxValue <= 100) {
            for (int i = 1; i <= maxValue; i++) {
                if (i % 15 == 0) {
                    System.out.println("FizzBuzz");
                }
                else if (i % 3 == 0) {
                    System.out.println("Fizz");
                }
                else if (i % 5 == 0) {
                    System.out.println("Buzz");
                }
                else {
                    System.out.println(i);
                }
            }
        }
        else {
            System.out.println("Please input a valid number!");
            fizzBuzz();
        }
    }

    public static int readUserValue() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number between 1 and 100:");

        while (true) {
            try {
                return scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Please enter a number");
                scanner.next();
            }
        }
    }
}
