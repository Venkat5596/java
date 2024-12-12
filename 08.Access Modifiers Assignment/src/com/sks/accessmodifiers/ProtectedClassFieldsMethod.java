package com.sks.accessmodifiers;

public class ProtectedClassFieldsMethod {

    protected String name;

    protected void protectedMethod() {
        System.out.println("This is a " + name);
    }
}

class ProtectedClass_03 {
    public static void main(String[] args) {
        ProtectedClassFieldsMethod pc = new ProtectedClassFieldsMethod();

        pc.name = "Protected Method";

        pc.protectedMethod();
    }
}
