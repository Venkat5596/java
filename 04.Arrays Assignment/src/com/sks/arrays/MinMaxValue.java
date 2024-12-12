
package com.sks.arrays;

import java.util.Arrays;

public class MinMaxValue {

    static void Value(int[] arr) {

        int min = arr[0];
        int max =arr[0];

        for (int j : arr) {
            if (j < min)
                min = j;
            else if (j > max)
                max = j;
        }
        System.out.println("min value :"+min);
        System.out.println("max value :"+max);
    }


    public static void main(String[] args) {
        int[] my_arr = {11, 22, 33, 44, 55, 66};

        Value(my_arr);

    }
}