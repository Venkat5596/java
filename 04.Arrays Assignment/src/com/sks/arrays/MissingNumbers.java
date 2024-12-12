package com.sks.arrays;

import java.util.Arrays;

public class MissingNumbers {

    static void findMissingNumbers(int[] array) {
        Arrays.sort(array);
        System.out.println("Sorted array: " + Arrays.toString(array));
        int j = 0;
        for (int i = 1; i <= 100; i++) {
            if (j < array.length && i == array[j]) {
                j++;
            } else {
                System.out.print(i + " ");
            }
        }
    }

    public static void main(String[] args) {
        int[] array = {10, 20, 30, 40, 50, 60, 70, 80, 90};
        findMissingNumbers(array);
    }
}
