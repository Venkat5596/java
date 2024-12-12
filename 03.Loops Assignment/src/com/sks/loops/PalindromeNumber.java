
package com.sks.loops;

import java.util.Scanner;

public class PalindromeNumber {

    static boolean palindromeNumber(int num) {
        int r, sum = 0, temp;

        temp = num;
        while (num > 0) {
            r = num % 10;
            sum = (sum * 10) + r;
            num = num / 10;
        }

        return temp == sum;
    }

    public static void main(String[] args) {
        int num;
        System.out.print("Enter a value : ");
        num = new Scanner(System.in).nextInt();

        if (palindromeNumber(num)) {
            System.out.println(num + " is a Palindrome Number");
        } else {
            System.out.println(num + " is not a Palindrome Number");
        }
    }
}