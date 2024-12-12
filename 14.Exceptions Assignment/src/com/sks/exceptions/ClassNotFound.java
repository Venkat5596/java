
package com.sks.exceptions;

public class ClassNotFound {

    public static void main(String[] args) {

        try {
            Class.forName("com.exceptions.sks");
            ClassLoader.getSystemClassLoader().loadClass("com.exceptions.sks");

        } catch (ClassNotFoundException e) {
            System.out.println(e);
        }
    }
}