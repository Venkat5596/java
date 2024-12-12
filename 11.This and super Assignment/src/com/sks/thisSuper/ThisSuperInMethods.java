package com.sks.thisSuper;

class Parent1 {
    void firstMethod() {
        System.out.println("Used this() and super() in methods");
    }

    void secondMethod() {
        this.firstMethod();
    }
}

class Child1 extends Parent1 {
    void thirdMethod() {
        super.secondMethod();
    }
}

public class ThisSuperInMethods {
    public static void main(String[] args) {
        Child1 c = new Child1();
        c.thirdMethod();
    }
}
