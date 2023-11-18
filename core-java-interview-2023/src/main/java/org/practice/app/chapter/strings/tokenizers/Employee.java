package org.practice.app.chapter.strings.tokenizers;

public class Employee {
    private String name,Job;
    private double salary;

    public Employee(String name, String job, double salary) {
        this.name = name;
        Job = job;
        this.salary = salary;
    }

    public Employee() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getJob() {
        return Job;
    }

    public void setJob(String job) {
        Job = job;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", Job='" + Job + '\'' +
                ", salary=" + salary +
                '}';
    }
}
