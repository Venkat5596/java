package com.sks.arrays;

import java.util.Arrays;

public class CommonValuesInTwoArrays {

    static void findCommonValues(int[] array1, int[] array2) {
        for (int num1 : array1) {
            for (int num2 : array2) {
                if (num1 == num2) {
                    System.out.println("Common value: " + num1);
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] array1 = {11, 22, 33, 44, 55};
        int[] array2 = {66, 55, 77, 11, 88};

        System.out.println("array1 = " + Arrays.toString(array1));
        System.out.println("array2 = " + Arrays.toString(array2));

        findCommonValues(array1, array2);
    }
}
