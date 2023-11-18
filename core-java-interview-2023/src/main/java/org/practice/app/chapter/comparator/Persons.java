package org.practice.app.chapter.comparator;

class Persons implements Comparable<Persons> {
    private String name;
    private int age;
    private double salary;

    public Persons(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Persons(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public int compareTo(Persons o) {
        return Integer.compare(this.getAge(), o.getAge());
    }
}
