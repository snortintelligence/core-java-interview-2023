package org.practice.app.chapter.generics;

public class Printer<T> {
    public void arrayPrinter(T[] data){
        for (T d: data) {
            System.out.println(d);
        }
    }

    public static void main(String[] args) {
        String[] strArr = {"Hello", "Hi","Welcome"};
        Integer[] numArr = {1,2,3,45,5,6};
        Printer p = new Printer();
        p.arrayPrinter(strArr);
        p.arrayPrinter(numArr);
    }
}
