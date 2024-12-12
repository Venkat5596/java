package com.sks.collections;

import java.util.Iterator;

public class HashSetExample {
    public static void main(String[] args) {

        java.util.HashSet<String> numbersSet = new java.util.HashSet<>();

        numbersSet.add("alpha");
        numbersSet.add("beta");
        numbersSet.add("gamma");
        numbersSet.add("delta");


        System.out.println("\nAfter adding elements to HashSet:");
        System.out.println("numbersSet = " + numbersSet);

        Iterator<String> itr = numbersSet.iterator();
        System.out.println("\nIterating through the HashSet:");
        while (itr.hasNext()) {
            System.out.print(itr.next() + " ");
        }
        System.out.println();

        System.out.println("\nClone/copy of HashSet:");
        System.out.println(numbersSet.clone());

        numbersSet.remove("alpha");
        System.out.println("\nAfter removing element 'alpha':");
        System.out.println("numbersSet = " + numbersSet);

        System.out.println("\nChecking if the set is empty:");
        System.out.println(numbersSet.isEmpty());

        System.out.println("\nSize of the HashSet:");
        System.out.println(numbersSet.size());

        System.out.println("\nElement 'beta' is present in the HashSet:");
        System.out.println(numbersSet.contains("beta"));

        System.out.println("\nAfter removing all elements of the HashSet:");
        numbersSet.clear();
        System.out.println("numbersSet = " + numbersSet);
    }
}
