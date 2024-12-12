package com.sks.basics;

public class CreatingClassObjectMethod {
    // created a method using methodName()
    void isMethod() {

        String a = "This is a Method";
        System.out.println(a);
    }

    public static void main(String[] args) {

        CreatingClassObjectMethod obj = new CreatingClassObjectMethod();

        obj.isMethod();
    }
}