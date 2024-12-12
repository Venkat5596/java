package com.sks.exceptions;

class InvalidExamException extends Exception {
    InvalidExamException(String msg) {
        System.out.println(msg);
    }
}

public class CreateOwnException {

    static void exam(int marks) throws InvalidExamException {
        if (marks < 40) {
            throw new InvalidExamException("Failed in exam");
        } else {
            System.out.println("Passed in exam");
        }
    }

    public static void main(String[] args) {
        try {
            exam(35);
        } catch (Exception i) {
            i.printStackTrace();
        }
    }
}
