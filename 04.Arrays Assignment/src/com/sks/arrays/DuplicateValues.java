package com.sks.arrays;

import java.util.Arrays;

public class DuplicateValues {

    static void findDuplicateValues(int[] array) {
        System.out.println("Duplicate values: ");
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if ((array[i] == array[j] && (i != j))) {
                    System.out.print(array[j] + " ");
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] array = {11, 22, 33, 44, 55, 22, 44, 33};
        System.out.println("array = " + Arrays.toString(array));
        findDuplicateValues(array);
    }
}
