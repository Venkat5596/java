package com.sks.statics;

public class Static {

    static int staticVar1 = 11;
    static int staticVar2 = 22;

    int instanceVar1 = 33;
    int instanceVar2 = 44;

    static void printInstanceVars() {
        Static obj = new Static();
        System.out.println("Instance variables: " + obj.instanceVar1 + ", " + obj.instanceVar2);
    }

    void printStaticVars() {
        System.out.println("Static variables: " + staticVar1 + ", " + staticVar2);
    }

    static void callInstanceMethod() {
        Static obj = new Static();
        obj.printStaticVars();
    }

    void callStaticMethod() {
        printInstanceVars();
    }

    public static void main(String[] args) {
        Static example = new Static();

        System.out.println("Static variables: " + staticVar1 + ", " + staticVar2);
        System.out.println("Instance variables: " + example.instanceVar1 + ", " + example.instanceVar2);

        printInstanceVars();
        callInstanceMethod();

        example.printStaticVars();
        example.callStaticMethod();
    }
}
