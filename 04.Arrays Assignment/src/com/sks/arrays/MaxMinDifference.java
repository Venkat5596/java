package com.sks.arrays;

import java.util.Arrays;

public class MaxMinDifference {

    static void calculateDifference(int[] array) {
        int max = array[0];
        int min = array[0];
        int difference;

        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            } else if (array[i] < min) {
                min = array[i];
            }
        }

        difference = max - min;

        System.out.printf("Maximum value: %d, Minimum value: %d", max, min);
        System.out.println("\nDifference between the largest and smallest values: " + difference);
    }

    public static void main(String[] args) {
        int[] array = {11, 22, 33, 44, 55};
        System.out.println("array = " + Arrays.toString(array));

        calculateDifference(array);
    }
}
