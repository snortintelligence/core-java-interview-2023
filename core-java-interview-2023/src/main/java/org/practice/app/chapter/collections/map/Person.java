package org.practice.app.chapter.collections.map;

import java.util.HashMap;
import java.util.Map;

public class Person {
    int id;
    String name;

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public static void main(String[] args) {
        Person p1 = new Person(1, "Aman");
        Person p2 = new Person(2, "Sid");
        Person p3 = p1;

        Map<Person, Integer> persons = new HashMap<>();
        persons.put(p1, 1);
        persons.put(p2, 2);
        persons.put(p3, 3);
        System.out.println("Total persons in map : "+persons.size());


    }

}
