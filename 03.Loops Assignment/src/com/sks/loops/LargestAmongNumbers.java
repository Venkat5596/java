
package com.sks.loops;

import java.util.Scanner;

public class LargestAmongNumbers {
    public static void main(String[] args) {

        int a, b, c;
        Scanner num = new Scanner(System.in);

        System.out.print("Enter First Number : ");
        a = num.nextInt();
        System.out.print("Enter Second Number : ");
        b = num.nextInt();
        System.out.print("Enter Third Number : ");
        c = num.nextInt();

        if ((a > b) && (a > c)) {
            System.out.println("The Largest Number is : " + a);
        }

        else if ((b > a) && (b > c)) {
            System.out.println("The Largest Number is : " + b);
        }

        else {
            System.out.println("The Largest Number is : " + c);
        }
    }
}