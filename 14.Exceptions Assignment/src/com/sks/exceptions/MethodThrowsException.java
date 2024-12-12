package com.sks.exceptions;

public class MethodThrowsException {
    static void throwException() {
        throw new RuntimeException("Throwing exception");
    }

    public static void main(String[] args) {
        throwException();
    }
}
