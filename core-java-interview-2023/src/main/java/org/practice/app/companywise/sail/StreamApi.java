package org.practice.app.companywise.sail;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamApi {
    public static void main(String[] args) {
        //Question 1. create array list of names then list (filter) name start with A using stream
        List<String> nameList = new ArrayList<>();
        nameList.add("Aman");
        nameList.add("Siddhartha");
        nameList.add("Vivek");
        nameList.add("Amit");

        nameList.stream().filter(name->name.startsWith("A")).forEach(System.out::println);

        //Question 2. create array list employees then store back into Map<Integer,Employee>
        List<Employee> empList = new ArrayList<>();
        empList.add(new Employee(1, "Aman"));
        empList.add(new Employee(2, "Siddhartha"));
        empList.add(new Employee(3, "Vivek"));
        Map<Integer,Employee> empMap = new HashMap<>();

        /**
         *
         * The issue here is related to the usage of map in the stream. The map function is used for transformation, not for side effects like updating a map.
         * In your case, you are using map to put elements into the empMap, but it returns a Stream of null values because HashMap.put()
         * method returns the previous value associated with the key, or null if there was no mapping.
         * problem in code : empList.stream().map(e -> empMap.put(e.getId(), e));
         * If you want to populate a Map with the elements of the list, you can use Collectors.toMap directly in the stream. Here's the corrected code:
         *
         * */
        //Stream<Employee> empStream = empList.stream().map(e -> empMap.put(e.getId(), e));

        empMap = empList.stream().collect(Collectors.toMap(Employee::getId, employee -> employee));

        empMap.forEach((id, e)-> System.out.println(id +", "+e));

//        empMap.entrySet().forEach(System.out::println);
//
//        empMap.entrySet().stream().forEach(System.out::println);
//
//        Set<Map.Entry<Integer, Employee>> entries = empMap.entrySet();
//
//        for( Map.Entry<Integer, Employee> emp :entries){
//            System.out.println("emp : "+emp);
//        }



    }
}
