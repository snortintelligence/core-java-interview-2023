package org.practice.app.chapter.dsa.arrays;

public class SimpleArraySum {

    public static void main(String[] args) {
        System.out.println("sum = "+(arraySum(new int[]{1,2,3,4,5})));
    }
    public static long arraySum(int[] numArr){
        int sum=0;
        for (int n: numArr) {
            sum+=n;
        }
        return sum;
    }
}
