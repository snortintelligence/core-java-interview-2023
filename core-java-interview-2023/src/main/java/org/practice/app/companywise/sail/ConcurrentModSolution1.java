package org.practice.app.companywise.sail;

import java.util.*;
import java.util.stream.Collectors;

/**
 *
 * ConcurrentModificationException occurs when you try to modify a collection while iterating over it concurrently,
 * i.e., when one thread is iterating over the collection and another thread is modifying it. To avoid ConcurrentModificationException,
 * you can take several approaches:
 *
 * using a standard for loop with an index (for (int i = 0; i < nameList.size(); i++)) should not raise a ConcurrentModificationException
 * when removing elements from the list. This exception is typically associated with the enhanced for loop (for (String name : nameList))
 * or when using an iterator explicitly.
 *
 *
 * **/
public class ConcurrentModSolution1 {
    public static void main(String[] args) {

        List<String> nameList = new ArrayList<>();
        nameList.add("Aman");
        nameList.add("Vivek");
        nameList.add("Siddhartha");
        nameList.add("Vivek");
        nameList.add("Amit");
        nameList.add("Aman");

//        for (String name: nameList) {
//            if(name.equals("Aman")){
                    //can not work for direct modification
////                nameList.remove(name);
//            }
//        }

        for (int i = 0; i < nameList.size(); i++) {
            //Solution 1.
            if(nameList.get(i).equalsIgnoreCase("Aman")){
                //can direct modification
               nameList.remove(i); //remove all matches - duplicate
            }else{
                nameList.set(i, nameList.get(i).toUpperCase());
            }
        }
        System.out.println("Solution 1 (for loop) : "+nameList);

        //Solution 2.
        ListIterator<String> nameItr = nameList.listIterator();
        while (nameItr.hasNext()){
            //any modification can be done on nameItr
            String name = nameItr.next();
            if(name.equalsIgnoreCase("Vivek"))
                 //nameList.remove(name); //[Aman, Siddhartha, Amit]
                nameItr.remove();
                else
                //can modify name to Uppercase
                nameItr.set(name.toUpperCase());
        }

        System.out.println("Solution 2 (ListIterator) : "+nameList);

        //Using stream api
        nameList.clear();

        nameList.add("Aman");
        nameList.add("Vivek");
        nameList.add("Siddhartha");
        nameList.add("Vivek");
        nameList.add("Amit");
        nameList.add("Aman");

        //nameList = nameList.stream().filter(name->!name.equalsIgnoreCase("Aman")).collect(Collectors.toList());
        //with modification
        nameList = nameList.stream().filter(name->!name.equalsIgnoreCase("Aman")).map(name->name.toUpperCase()).collect(Collectors.toList());
        System.out.println("Solution 3 (stream api) : "+nameList);
    }
}
