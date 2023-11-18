package org.practice.app.chapter.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
*
* we use Collections.sort and provide a lambda expression as the comparator.
* The lambda expression compares Person objects based on their ages.
* This approach is concise and does not require implementing the Comparable interface or creating a separate Comparator class.
*
*
* */

public class LambdaCom {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Alice", 25, 88000));
        people.add(new Person("Bob", 30, 66680));
        people.add(new Person("Charlie", 20, 33000));

        List<Person> people_copy = people;

        System.out.println("Sorting by Name");
        Collections.sort(people_copy, (p1,p2)->p1.getName().compareTo(p2.getName()));
        System.out.println(people_copy);

        System.out.println("Sorting by Age");
        people_copy = people;
        Collections.sort(people, (p1,p2)->Integer.compare(p1.getAge(), p2.getAge()));
        System.out.println(people_copy);

        System.out.println("Sorting by Salary");
        people_copy = people;
        Collections.sort(people, (p1,p2)->Double.compare(p1.getSalary(), p2.getSalary()));
        System.out.println(people_copy);

    }
}
