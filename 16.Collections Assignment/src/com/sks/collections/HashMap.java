package com.sks.collections;

public class HashMapExample {
    public static void main(String[] args) {

        java.util.HashMap<Integer, String> studentMap = new java.util.HashMap<>();

        studentMap.put(1, "Kumar");
        studentMap.put(2, "Vikram");
        studentMap.put(3, "Leo");
        studentMap.put(4, "Priya");
        studentMap.put(5, "Amit");

        System.out.println("\nKey-value pairs of the Student ID and Name:");
        System.out.println("studentMap = " + studentMap);

        System.out.println("\nName of the Student with ID no = 6:");
        System.out.println(studentMap.get(6));

        System.out.println("\nClone/copy of HashMap studentMap:");
        System.out.println(studentMap.clone());

        System.out.println("\nID No = 3 is in the Map:");
        System.out.println(studentMap.containsKey(3));

        System.out.println("\nStudent Name = 'Kumar' is in the map:");
        System.out.println(studentMap.containsValue("Kumar"));

        System.out.println("\nChecking if the map is empty:");
        System.out.println(studentMap.isEmpty());

        System.out.println("\nThe size of the Map is:");
        System.out.println(studentMap.size());

        System.out.println("\nAll ID No of the students:");
        System.out.println(studentMap.keySet());

        System.out.println("\nRemoved ID no = 2, Student name = 'Vikram':");
        studentMap.remove(2, "Vikram");
        System.out.println(studentMap);

        System.out.println("\nCopied all the elements of the studentMap to newMap:");

        java.util.HashMap<Integer, String> newMap = new java.util.HashMap<>();

        newMap.putAll(studentMap);
        System.out.println("newMap = " + newMap);
    }
}
