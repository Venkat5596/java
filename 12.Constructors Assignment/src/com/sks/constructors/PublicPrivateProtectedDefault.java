
package com.sks.constructors;


public class PublicPrivateProtectedDefault {
    int rollNo;
    String name;
    String clg;
    String city;
    {
    System.out.println("Student Details");}

    PublicPrivateProtectedDefault() {
        this(11);
    }


    public PublicPrivateProtectedDefault(int rollNo) {
        this("Sharan");
        this.rollNo = rollNo;
        System.out.println("rollNo : " + rollNo);
    }


    private PublicPrivateProtectedDefault(String name) {
        this("JNTUH", "Hyderabad");
        this.name = name;
        System.out.println("Name : " + name);
    }


    protected PublicPrivateProtectedDefault(String clg, String city) {
        this.clg = clg;
        this.city = city;
        System.out.println("college : " + clg);
        System.out.println("City : " + city);
    }

    public static void main(String[] args) {

        PublicPrivateProtectedDefault c = new PublicPrivateProtectedDefault();
    }

}