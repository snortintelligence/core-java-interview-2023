package org.practice.app.chapter.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class PersonsMain  {
    public static void main(String[] args) {
        List<Persons> people = new ArrayList<>();
        people.add(new Persons("Alice", 25, 33000));
        people.add(new Persons("Bob", 30, 66000));
        people.add(new Persons("Charlie", 20, 89000));

        Collections.sort(people);
        System.out.println(people);

    }
}
