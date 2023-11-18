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
public class SalaryComparator implements Comparator<Person> {
    @Override
    public int compare(Person o1, Person o2) {
        return Double.compare(o1.getSalary(), o2.getSalary());
    }

    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Alice", 25, 88000));
        people.add(new Person("Bob", 30, 66680));
        people.add(new Person("Charlie", 20, 33000));

        Collections.sort(people, new SalaryComparator());
        people.forEach((p)->{
            System.out.println(p);
        });

    }
}
