package org.practice.app.chapter.collections;

import java.util.*;

public class CollectionApp {
    public static void main(String[] args) {

        System.out.println("C1 collection (ArrayList) : ");
        Collection<String> c1 = new ArrayList<>();
        c1.add("apple");
        c1.add("banana");
        c1.add("guava");
        System.out.println(c1);

        System.out.println("\nC2 collection(HashSet) : ");
        Collection<String> c2 = new HashSet<>();
        c2.add("A");
        c2.add("B");
        c2.add("D");

        System.out.println(c2);

        System.out.println("\nadding c2 in c1 (HashSet) ");
        c2.addAll(c1);
        System.out.println(c2); //no maintain insertion order

        System.out.println("\nadding c2 in c3 (LinkedHashSet) ");
        Collection<String> c3 = new LinkedHashSet<>();
        c3.addAll(c1);
        c3.addAll(c2);
        System.out.println(c3);
    }
}
