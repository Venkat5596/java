
package com.sks.interfaces;


interface D {
    void sameMethod();
}


interface E {
    void sameMethod();
}


class TwoInterfaceSameMethod implements D, E {
    @Override
    public void sameMethod() {
        System.out.println("This is same method in both the interfaces");
    }


    public static void main(String[] args) {
        TwoInterfaceSameMethod X = new TwoInterfaceSameMethod();
       X.sameMethod();
    }
}