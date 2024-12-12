package com.sks.operators;

public class IncrementDecrement {

    static void preIncrement(int num1, int num2) {
        int result = num2 + (++num1);
        System.out.println("Values after Pre-Increment: " + num1 + ", " + result);
    }

    static void postIncrement(int num1, int num2) {
        int result = num2 + (num1++);
        System.out.println("Values after Post-Increment: " + num1 + ", " + result);
    }

    static void preDecrement(int num1, int num2) {
        int result = num2 + (--num1);
        System.out.println("Values after Pre-Decrement: " + num1 + ", " + result);
    }

    static void postDecrement(int num1, int num2) {
        int result = num1--;
        System.out.println("Values after Post-Decrement: " + num1 + ", " + result);
    }

    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 14;
        preIncrement(num1, num2);
        postIncrement(num1, num2);
        preDecrement(num1, num2);
        postDecrement(num1, num2);
    }
}
