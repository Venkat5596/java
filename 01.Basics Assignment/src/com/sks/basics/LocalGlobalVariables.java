package com.sks.basics;

public class LocalGlobalVariables {

    int instanceVariable = 123;

    void printLocalVariable() {
        int localVariable = 34;
        System.out.println("Local variable: " + localVariable);
    }

    public static void main(String[] args) {
        LocalGlobalVariables obj = new LocalGlobalVariables();
        System.out.println("Instance variable: " + obj.instanceVariable);
        obj.printLocalVariable();
    }
}
