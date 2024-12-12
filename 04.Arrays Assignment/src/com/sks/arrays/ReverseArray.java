package com.sks.arrays;

import java.util.Arrays;

public class ReverseArray {

    static void reverseArray(int[] array) {
        int[] reversedArray = new int[array.length];
        int j = array.length;
        for (int element : array) {
            reversedArray[j - 1] = element;
            j--;
        }
        System.out.println("Reversed Array: " + Arrays.toString(reversedArray));
    }

    public static void main(String[] args) {
        int[] array = {11, 22, 33, 44, 55};
        System.out.println("Original Array: " + Arrays.toString(array));

        reverseArray(array);
    }
}
