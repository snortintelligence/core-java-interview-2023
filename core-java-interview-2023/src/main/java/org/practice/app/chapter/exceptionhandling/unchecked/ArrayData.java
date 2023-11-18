package org.practice.app.chapter.exceptionhandling.unchecked;

public class ArrayData {
    public static void main(String[] args) {
        String fruits[] = {"apple","mango","guava"};
        try {
            System.out.println(fruits[90]);
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
