package com.sks.arrays;

import java.util.Arrays;

public class SecondLargestNumber {

    static void findSecondLargest(int[] array) {
        int temp;

        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        System.out.println("The second largest number in the array: " + array[array.length - 2]);
    }

    public static void main(String[] args) {
        int[] array = {11, 22, 33, 44, 55, 53, 23};
        System.out.println("Original array: " + Arrays.toString(array));

        findSecondLargest(array);
    }
}
