package com.sks.thisSuper;

class Parent {
    String name = "Kumar";

    Parent() {
        System.out.println("This is parent class constructor");
    }
}

class Child extends Parent {
    String name = "SKS";

    Child() {
        super();
        System.out.println("This is child class constructor");
    }

    void displayParentName() {
        System.out.println("My name is " + super.name);
    }
}

public class CallUsingSuper {
    public static void main(String[] args) {
        Child c = new Child();
        c.displayParentName();
    }
}
