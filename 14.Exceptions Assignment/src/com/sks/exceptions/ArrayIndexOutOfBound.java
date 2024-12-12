package com.sks.exceptions;

public class ArrayIndexOutOfBound {

    public static void main(String[] args) {
        String[] arr = {"Kumar", "Vikram", "Leo", "Raj"};

        try {
            System.out.println(arr[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("ArrayIndexOutOfBoundsException caught");
            e.printStackTrace();
        }
    }
}
