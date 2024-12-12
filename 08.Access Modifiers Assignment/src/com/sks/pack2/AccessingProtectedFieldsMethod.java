package com.sks.pack2;

import com.sks.accessmodifiers.ProtectedClassFieldsMethod;

public class AccessingProtectedFieldsMethod extends ProtectedClassFieldsMethod {

    public static void main(String[] args) {
        AccessingProtectedFieldsMethod sub = new AccessingProtectedFieldsMethod();

        sub.description = "Protected Method in SubClass";

        sub.displayInfo();
    }
}
