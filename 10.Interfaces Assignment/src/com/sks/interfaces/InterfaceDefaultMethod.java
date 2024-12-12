
package com.sks.interfaces;

interface C {

    default void defaultMethod() {
        System.out.println("This is a default method");
    }
}

class InterfaceDefaultMethod implements C {
    public static void main(String[] args) {

        InterfaceDefaultMethod if6 = new InterfaceDefaultMethod();
        
        if6.defaultMethod();
    }
}