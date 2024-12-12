package com.sks.arrays;

import java.util.Arrays;

public class EvenOddNumbers {

    static void printEvenNumbers(int[] array) {
        System.out.print("Even numbers in the array: ");
        for (int number : array) {
            if (number % 2 == 0) {
                System.out.print(number + " ");
            }
        }
    }

    static void printOddNumbers(int[] array) {
        System.out.print("\nOdd numbers in the array: ");
        for (int number : array) {
            if (number % 2 != 0) {
                System.out.print(number + " ");
            }
        }
    }

    public static void main(String[] args) {
        int[] array = {11, 22, 33, 44, 55};
        System.out.println("array = " + Arrays.toString(array));

        printEvenNumbers(array);
        printOddNumbers(array);
    }
}
