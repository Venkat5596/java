package com.sks.collections;

import java.util.Arrays;
import java.util.Iterator;

public class ArrayListExample {

    public static void main(String[] args) {

        java.util.ArrayList<String> list = new java.util.ArrayList<>(
                Arrays.asList("alpha", "bravo", "charlie", "delta", "echo", "foxtrot"));
        System.out.println("\nlist = " + list);

        list.add("golf");
        list.add("hotel");
        list.add("india");
        list.add("juliet");
        System.out.println("After adding elements:");
        System.out.println("list = " + list);

        Iterator<String> itr = list.iterator();
        System.out.println("Iterating through the ArrayList:");
        while (itr.hasNext()) {
            System.out.print(itr.next() + " ");
        }
        System.out.println();

        list.add(1, "AtIndex1");
        System.out.println("\nAfter adding an element at index 1:");
        System.out.println("list = " + list);

        list.remove(1);
        System.out.println("\nAfter removing an element at index 1:");
        System.out.println("list = " + list);

        list.set(1, "BRAVO");
        System.out.println("\nAfter updating the element at index 1:");
        System.out.println("list = " + list);

        System.out.println("\nThe element is present at index:");
        System.out.println(list.indexOf("charlie"));

        System.out.println("\nThe element at index 3:");
        System.out.println(list.get(3));

        System.out.println("\nSize of the ArrayList:");
        System.out.println(list.size());

        System.out.println("\n'two' is present in the ArrayList:");
        System.out.println(list.contains("two"));

        System.out.println("\nAfter removing all elements of the ArrayList:");
        list.clear();
        System.out.println("list = " + list);
    }
}
