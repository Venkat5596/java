
package com.sks.accessmodifiers;

class PublicClass_04 {


    public String pName = "Public";


    public void publicMethod() {
        System.out.println("This is " + pName);
    }
}

public class PublicClassFieldsMethods {
    public static void main(String[] args) {

        PublicClass_04 pub = new PublicClass_04();

        pub.pName = "Public Method";

        pub.publicMethod();
    }
}