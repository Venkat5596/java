package com.sks.operators;

import java.util.Scanner;

public class NumberComparison {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number: ");

        int number1 = input.nextInt();
        System.out.print("Enter second number: ");
        int number2 = input.nextInt();

        if (number1 == number2) {
            System.out.println("Both numbers are equal.");
        } else {
            System.out.println("The numbers are different.");
        }
    }
}
