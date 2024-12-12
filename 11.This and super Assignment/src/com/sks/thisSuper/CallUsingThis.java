package com.sks.thisSuper;

public class CallUsingThis {

    int number;
    String username;

    CallUsingThis() {
        this(22, "Kumar");
    }

    CallUsingThis(int number, String username) {
        this.number = number;
        this.username = username;
        System.out.println(number + " " + username);
    }

    public static void main(String[] args) {
        CallUsingThis ts1 = new CallUsingThis();
        CallUsingThis ts = new CallUsingThis(12, "Sks105");
    }
}
