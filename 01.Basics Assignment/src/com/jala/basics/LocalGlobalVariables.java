
package com.jala.basics;

public class LocalGlobalVariables {
   
    int a = 112;
    void localVariable() {
        //Local variables are declared in methods, constructors, or blocks.
        int a = 22;
        System.out.println("Local variable a : " + a);
    }
    // 
    // 

    
 
    public static void main(String[] args) {
        Lo calGlobalVariables obj = new LocalGlobalVariables();
        System.out.println("Instance variable a : " + obj.a);
        //calling method()
        obj.localVariable();
    }
} 