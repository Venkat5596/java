package com.sks.loops;

public class MultipleIfElseStatement {
    public static void main(String[] args) {

        int num1 = 45, num2 = 25, num3 = 65;

        if (num1 > num2 && num1 > num3) {
            System.out.println(num1 + " is the largest number.");
        } else if (num2 > num1 && num2 > num3) {
            System.out.println(num2 + " is the largest number.");
        } else {
            System.out.println(num3 + " is the largest number.");
        }
    }
}
