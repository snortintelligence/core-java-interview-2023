package org.practice.app.chapter.java8.streamapif2;

import java.util.List;

public class Employee {
    private int id;
    private String name;

//    OneToMany skills : must use flatMap in stream api
    private List<String> skills;
    private double salary;

    private String department;

    public Employee(int id, String name, List<String> skills, double salary, String department) {
        this.id = id;
        this.name = name;
        this.skills = skills;
        this.salary = salary;
        this.department = department;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getSkills() {
        return skills;
    }

    public void setSkills(List<String> skills) {
        this.skills = skills;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", skills=" + skills +
                ", salary=" + salary +
                ", department='" + department + '\'' +
                '}';
    }
}
