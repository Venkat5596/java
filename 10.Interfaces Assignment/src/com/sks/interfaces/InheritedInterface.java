
package com.sks.interfaces;

interface A {
    void methodOne();
}


interface B extends A {
    void methodTwo();
}

class InheritedInterface implements B {

    @Override
    public void methodOne() {
        System.out.println("This is first method");
    }

    @Override
    public void methodTwo() {
        System.out.println("This is second method");
    }

    public static void main(String[] args) {

        InheritedInterface if7 = new InheritedInterface();

        if7.methodOne();
        if7.methodTwo();
    }
}