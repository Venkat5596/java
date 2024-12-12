package com.sks.arrays;

import java.util.Arrays;
import java.util.Scanner;



public class SpecificElementsChecker {

    static void checkContains(int[] array, int num1, int num2) {
        boolean foundNum1 = false;
        boolean foundNum2 = false;

        for (int element : array) {
            if (element == num1) {
                foundNum1 = true;
            }
            if (element == num2) {
                foundNum2 = true;
            }
        }

        if (foundNum1) {
            System.out.printf("Array contains the value %d.", num1);
        } else {
            System.out.printf("\nArray does not contain the value %d.", num1);
        }

        if (foundNum2) {
            System.out.printf("\nArray contains the value %d.", num2);
        } else {
            System.out.printf("\nArray does not contain the value %d.", num2);
        }

        System.out.println("\nThe array is: " + Arrays.toString(array));
    }

    public static void main(String[] args) {
        int[] array = {11, 22, 12, 33, 44, 23, 55};

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter two values to check in the array: ");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        checkContains(array, num1, num2);
    }
}
