package com.sks.methodOverloading;

public class MethodOverloading {
    int number1;
    int number2;
    int id;
    String username;
    String department;

    void firstMethod(int number1) {
        this.number1 = number1;
        System.out.println("1. First number: " + number1);
    }

    void firstMethod(int number1, int number2) {
        this.number1 = number1;
        this.number2 = number2;
        System.out.println("1. Sum of two numbers: " + (number1 + number2));
    }

    void secondMethod(int id) {
        this.id = id;
        System.out.println("2. ID number: " + id);
    }

    void secondMethod(int id, String username) {
        this.id = id;
        this.username = username;
        System.out.println("2. ID number: " + id + "; Username: " + username);
    }

    void fourthMethod(int id) {
        this.id = id;
        System.out.println("4. ID number: " + id);
    }

    void fourthMethod(String username) {
        this.username = username;
        System.out.println("4. Username: " + username);
    }

    void fourthMethod(int id, String department) {
        this.id = id;
        this.department = department;
        System.out.println("4. ID number: " + id + "; Department: " + department);
    }

    public static void main(String[] args) {
        MethodOverloading mo = new MethodOverloading();

        mo.firstMethod(11);
        mo.firstMethod(10, 20);

        mo.secondMethod(415);
        mo.secondMethod(415, "SKS");

        mo.fourthMethod(415);
        mo.fourthMethod("SKS");
        mo.fourthMethod(415, "Engineering");
    }
}
