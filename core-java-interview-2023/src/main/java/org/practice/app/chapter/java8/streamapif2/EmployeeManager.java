package org.practice.app.chapter.java8.streamapif2;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EmployeeManager {
    public static void main(String[] args) {
        // Create 10 Employee objects

        // Create 10 random Employee objects
//        List<Employee> employees = Arrays.asList(
//                new Employee(1, "Alice", Arrays.asList("Java", "Python"), 60000, "HR"),
//                new Employee(2, "Bob", Arrays.asList("C++", "JavaScript"), 55000, "Finance"),
//                new Employee(3, "Charlie", Arrays.asList("Java", "SQL"), 70000, "Engineering"),
//                new Employee(4, "David", Arrays.asList("Python", "HTML"), 62000, "HR"),
//                new Employee(5, "Eve", Arrays.asList("JavaScript", "CSS"), 58000, "Finance"),
//                new Employee(6, "Frank", Arrays.asList("Java", "Ruby"), 65000, "Engineering"),
//                new Employee(7, "Grace", Arrays.asList("C++", "PHP"), 56000, "HR"),
//                new Employee(8, "Hank", Arrays.asList("Java", "Python"), 72000, "Finance"),
//                new Employee(9, "Ivy", Arrays.asList("SQL", "HTML"), 61000, "Engineering"),
//                new Employee(10, "Jack", Arrays.asList("JavaScript", "CSS"), 59000, "HR")
//        );

        List<Employee> employees = Stream.of(
                new Employee(7, "Grace", Arrays.asList("C++", "PHP"), 56000, "HR"),
                new Employee(3, "Charlie", Arrays.asList("Java", "SQL"), 70000, "Engineering"),
                new Employee(9, "Ivy", Arrays.asList("SQL", "HTML"), 61000, "Engineering"),
                new Employee(5, "Eve", Arrays.asList("JavaScript", "CSS"), 58000, "Finance"),
                new Employee(6, "Frank", Arrays.asList("Java", "Ruby"), 65000, "Engineering"),
                new Employee(10, "Jack", Arrays.asList("JavaScript", "CSS"), 59000, "HR"),
                new Employee(2, "Bob", Arrays.asList("C++", "JavaScript"), 55000, "Finance"),
                new Employee(8, "Hank", Arrays.asList("Java", "Python"), 72000, "Finance"),
                new Employee(1, "Alice", Arrays.asList("Java", "Python"), 60000, "HR"),
                new Employee(4, "David", Arrays.asList("Python", "HTML"), 62000, "HR")
        ).collect(Collectors.toList());

        //Collect only employee names
        List<String> names = employees.stream().map(Employee::getName).collect(Collectors.toList());
        System.out.println("List of employees name[] : ");
        System.out.println(names);

        //List all skills in single List
        List<String> skills = employees.stream().flatMap(employee -> employee.getSkills().stream()).collect(Collectors.toList());
        System.out.println(skills);

        //Highest Salary
        Optional<Double> maxSalary = employees.stream().map(Employee::getSalary).reduce(Double::max);

        Optional<Double> minSalary = employees.stream().map(Employee::getSalary).reduce(Double::min);

        System.out.println("maxSalary = "+maxSalary.get());
        System.out.println("minSalary = "+minSalary.get());

        Optional<Employee> max = employees.stream().max(Comparator.comparingDouble(Employee::getSalary));

        Optional<Employee> min = employees.stream().min(Comparator.comparingDouble(Employee::getSalary));

        System.out.println("Max Salary emp: "+max);
        System.out.println("Min Salary emp: "+min);

    }
}
