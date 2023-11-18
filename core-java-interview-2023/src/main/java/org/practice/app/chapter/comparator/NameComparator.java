package org.practice.app.chapter.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/*
 *
 * In Java, a Comparator is used to define custom sorting orders for objects. You can use it to compare objects and specify
 * how they should be ordered in various data structures like lists, sets, or arrays.
 *
 * */
public class NameComparator implements Comparator<Person> {
    @Override
    public int compare(Person o1, Person o2) {
        return o1.getName().compareTo(o2.getName());
    }

    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Alice", 25));
        people.add(new Person("Bob", 30));
        people.add(new Person("Charlie", 20));

        Collections.sort(people, new NameComparator());
        people.forEach((p)->{
            System.out.println(p);
        });

    }
}
