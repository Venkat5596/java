package com.sks.loops;

import java.util.Scanner;

public class ArmstrongNumberChecker {

    static boolean isArmstrong(int number) {
        int remainder, result = 0;
        int temp = number;

        while (number != 0) {
            remainder = number % 10;
            result += Math.pow(remainder, 3);
            number = number / 10;
        }

        return temp == result;
    }

    public static void main(String[] args) {
        System.out.print("Enter a number: ");
        int inputNumber = new Scanner(System.in).nextInt();

        if (isArmstrong(inputNumber)) {
            System.out.println(inputNumber + " is an Armstrong number.");
        } else {
            System.out.println(inputNumber + " is not an Armstrong number.");
        }
    }
}
