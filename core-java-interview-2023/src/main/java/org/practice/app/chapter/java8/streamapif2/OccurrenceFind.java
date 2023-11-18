package org.practice.app.chapter.java8.streamapif2;

import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class OccurrenceFind {
    public static void main(String[] args) {
        // Create 10 Employee objects
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

        //List all skills
        List<String> skills =employees.stream().flatMap(employee -> employee.getSkills().stream()).collect(Collectors.toList());

        //Find word Occurrence groupingBy
        Map<String, Long> skillsCount = skills.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(skillsCount);

        //Find char Occurrence groupingBy
         String word = "JavaScript";
        Map<String, Long> charSeq = Arrays.stream(word.split("")).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(charSeq);

        //Perform employee groupingBy department
        Map<String, List<Employee>> empByDepartment = employees.stream().collect(Collectors.groupingBy(Employee::getDepartment));
        System.out.println(empByDepartment);
    }
}
