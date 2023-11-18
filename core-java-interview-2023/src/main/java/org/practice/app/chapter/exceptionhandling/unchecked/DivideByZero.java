package org.practice.app.chapter.exceptionhandling.unchecked;

public class DivideByZero {
    public static void main(String[] args) {
        try {
            int div = 10/0;
            System.out.println(div);
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
