package com.sks.constructors;

class ChildClass_02 extends ParentClass_01 {

    String college;
    String city;

    ChildClass_02() {
        super();
    }

    ChildClass_02(int rollNo) {
        super(rollNo);
    }

    ChildClass_02(String name, String branch, String college, String city) {
        super(name, branch);
        this.college = college;
        this.city = city;
        System.out.println("College: " + this.college);
    }
}

public class CallSuperFromChild {
    public static void main(String... args) {
        new ChildClass_02();
        new ChildClass_02(317);
        new ChildClass_02("SKS", "CSE", "JNTUK", "Hyderabad");
    }
}
