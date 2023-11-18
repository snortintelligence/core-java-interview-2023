package org.practice.app.chapter.collections.list;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class PersonsList {
    public static void main(String[] args) {
        Person p1 = new Person(1, "Aman");
        Person p2 = new Person(2, "Sid");
        Person p3 = new Person(1, "Aman");
        Person p5 = new Person(2, "Sid");

        ArrayList<Person> al = new ArrayList<Person>();
        System.out.println("before List size : "+al.size());

        al.add(p1);
        al.add(p2);
        al.add(p3);
        al.add(p5);
        al.trimToSize();
        System.out.println("after List size : "+al.size());


    }
}
