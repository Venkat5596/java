package com.sks.arrays;

public class AverageCalculator {

    static void calculateAverage(int[] array) {
        int sum = 0;

        for (int number : array) {
            sum += number;
        }

        int average = sum / array.length;

        System.out.print("The average value of the array is " + average);
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        calculateAverage(array);
    }
}
