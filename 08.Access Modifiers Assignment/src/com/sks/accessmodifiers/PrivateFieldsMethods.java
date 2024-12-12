
package com.sks.accessmodifiers;

public class PrivateFieldsMethods {

    private String name = "kumar";
    private int age = 23;


    private void pvtMethod() {
        System.out.println("My Name is " + name + " and my age is " + age);
    }


    public static void main(String[] args) {
        PrivateFieldsMethods obj = new PrivateFieldsMethods();

        System.out.println(obj.age);
        System.out.println(obj.name);

        obj.pvtMethod();
    }

}