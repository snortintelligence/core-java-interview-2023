package org.practice.app.companywise.sail;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * ConcurrentModificationException occurs when you try to modify a collection while iterating over it concurrently,
 * i.e., when one thread is iterating over the collection and another thread is modifying it. To avoid ConcurrentModificationException,
 * you can take several approaches:
 *
 *
 * **/
public class ConcurrentModificationProblem {
    public static void main(String[] args) {

        List<String> nameList = new ArrayList<>();
        nameList.add("Aman");
        nameList.add("Siddhartha");
        nameList.add("Vivek");
        nameList.add("Amit");

        for (String name: nameList) {
            if(name.equals("Aman")){
//                nameList.remove(name);
            }
        }

        System.out.println(nameList);

        List<Employee> empList = new ArrayList<>();
        empList.add(new Employee(1, "Aman"));
        empList.add(new Employee(2, "Siddhartha"));
        empList.add(new Employee(3, "Vivek"));
        Map<Integer,Employee> empMap = new HashMap<>();

        for (Employee e: empList) {
            if(e.getId()%2==1)
            {
                empList.remove(e);
            }
        }


    }
}
