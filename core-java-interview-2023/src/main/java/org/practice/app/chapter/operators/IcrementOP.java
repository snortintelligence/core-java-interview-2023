package org.practice.app.chapter.operators;

public class IcrementOP {
    public static void main(String[] args) {
        int sum=0;
        for (int i = 0, j=0; i <5 && j<5; i++, j=i+1) {
            System.out.println("i = "+i);
            System.out.println("j = "+j);
            sum+=i;
            System.out.println("sum = "+sum);
        }
    }
}
