package com.sks.arrays;

public class ArraySumCalculator {

    static int calculateSum(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] array = {10, 20, 30, 40, 50};

        for (int number : array) {
            System.out.print(number + " + ");
        }

        System.out.print(" = " + calculateSum(array));
    }
}
