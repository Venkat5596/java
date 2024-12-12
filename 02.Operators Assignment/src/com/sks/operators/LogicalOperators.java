package com.sks.operators;

public class LogicalOperators {
    public static void main(String[] args) {
        int number1 = 15;
        int number2 = 10;
        int number3 = 5;

        System.out.println(number1 > number2 && number1 > number3);
        System.out.println(number1 < number2 && number1 < number3);
        System.out.println(number1 > number2 && number1 < number3);

        System.out.println(number1 > number2 || number1 > number3);
        System.out.println(number1 < number2 || number1 < number3);
        System.out.println(number1 < number2 || number1 > number3);

        System.out.println(!(number1 > number2));
        System.out.println(!(number1 < number2));
    }
}
