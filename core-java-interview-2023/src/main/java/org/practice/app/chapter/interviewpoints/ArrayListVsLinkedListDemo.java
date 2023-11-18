package org.practice.app.chapter.interviewpoints;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayListVsLinkedListDemo {
    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList();
        for (int i = 1; i <=5; i++) {
            arrayList.add(i);
        }

        System.out.println("arrayList [] : "+arrayList);
        arrayList.add(2,99);
        System.out.println("add 99 at index 2 : "+arrayList);
        arrayList.remove(3);
        System.out.println("remove index 3 : "+arrayList);
        System.out.println("List first item [] : "+arrayList.get(0));
        System.out.println("List last item [] : "+arrayList.get(arrayList.size()-1));

        //
        LinkedList<Integer> linkedList = new LinkedList<>();
        for (int i = 1; i < 6; i++) {
            linkedList.add(i);
        }
        System.out.println("\nlinkedList [] : "+linkedList);
        linkedList.add(2,99);
        System.out.println("add 99 at index 2 : "+linkedList);
        linkedList.remove(3);
        System.out.println("remove index 3 : "+linkedList);
        System.out.println("List first item [] : "+linkedList.peekFirst());
        System.out.println("List last item [] : "+linkedList.peekLast());

        linkedList.removeFirst();
        linkedList.removeLast();
        System.out.println("\nremoved first & last elements linkedList [] : "+linkedList);

    }
}
