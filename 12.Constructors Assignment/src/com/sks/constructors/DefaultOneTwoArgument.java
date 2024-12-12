
package com.sks.constructors;

class ParentClass_01 {
    int rollNo;
    String name;
    String branch;


    ParentClass_01() {
        System.out.println("Student Details");
    }


    ParentClass_01(int rollNo) {
        this.rollNo = rollNo;
        System.out.println("Roll No : " + this.rollNo);
    }


    ParentClass_01(String name, String branch) {
        this.name = name;
        this.branch = branch;
        System.out.println("Name : " + this.name);
        System.out.println("Branch : " + this.branch);
    }
}

public class DefaultOneTwoArgument {
    public static void main(String... args) {


        new ParentClass_01();
        new ParentClass_01(317);
        new ParentClass_01("Sharan", "CSE");
    }
}