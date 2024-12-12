
package com.sks.arrays;

import java.util.*;

public class CopyArray {

    static void copyingArray(int[] arr) {

        int[] copy = arr;

        System.out.println("Array after copying to c = " + Arrays.toString(copy));
    }

    public static void main(String[] args) {
       int [] my_arr = {1,3,5,6};
        System.out.println("my_arr = " + Arrays.toString(my_arr));

        copyingArray(my_arr);
    }
}