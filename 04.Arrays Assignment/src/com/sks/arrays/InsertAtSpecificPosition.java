package com.sks.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class InsertAtSpecificPosition {

    static void insertElement(int[] array, int index, int value) {
        for (int i = array.length - 1; i > index; i--) {
            array[i] = array[i - 1];
        }
        array[index] = value;
    }

    public static void main(String[] args) {
        int index, value;
        int[] array = {11, 22, 33, 44, 55, 66, 77, 88, 99};
        System.out.println("Original array: " + Arrays.toString(array));

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the index number: ");
        index = scanner.nextInt();
        System.out.printf("Enter the value to insert at index %d: ", index);
        value = scanner.nextInt();

        insertElement(array, index, value);

        System.out.println("Array after inserting element: ");
        System.out.println("array = " + Arrays.toString(array));
    }
}
