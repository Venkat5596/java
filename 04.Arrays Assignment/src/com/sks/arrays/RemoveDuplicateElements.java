package com.sks.arrays;

import java.util.Arrays;

public class RemoveDuplicateElements {

    static int removeDuplicates(int[] array, int length) {
        if (length == 0 || length == 1) {
            return length;
        }

        int[] temp = new int[length];
        int j = 0;
        for (int i = 0; i < length - 1; i++) {
            if (array[i] != array[i + 1]) {
                temp[j++] = array[i];
            }
        }
        temp[j++] = array[length - 1];

        for (int i = 0; i < j; i++) {
            array[i] = temp[i];
        }
        return j;
    }

    public static void main(String[] args) {
        int[] array = {11, 22, 22, 33, 44, 44, 55, 66, 66};

        System.out.println("Original array: " + Arrays.toString(array));
        int length = array.length;

        length = removeDuplicates(array, length);

        System.out.println("Array after removing duplicate values: ");
        for (int i = 0; i < length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
