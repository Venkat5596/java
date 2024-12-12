package com.sks.operators;

public class ArithmeticOperations {

    static void performAddition(int num1, int num2) {
        int result = num1 + num2;
        System.out.println("Addition of " + num1 + " + " + num2 + " = " + result);
    }

    static void performSubtraction(int num1, int num2) {
        int result = num1 - num2;
        System.out.println("Subtraction of " + num1 + " - " + num2 + " = " + result);
    }

    static void performMultiplication(int num1, int num2) {
        int result = num1 * num2;
        System.out.println("Multiplication of " + num1 + " * " + num2 + " = " + result);
    }

    static void performDivision(int num1, int num2) {
        int result = num1 / num2;
        System.out.println("Division of " + num1 + " / " + num2 + " = " + result);
    }

    public static void main(String[] args) {
        int num1 = 25;
        int num2 = 30;
        performAddition(num1, num2);
        performSubtraction(num1, num2);
        performMultiplication(num1, num2);
        performDivision(num1, num2);
    }
}
