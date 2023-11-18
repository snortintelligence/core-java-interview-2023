package org.practice.app.chapter.dsa.mathematics.numbertheory;

import java.math.BigInteger;

public class Factorial {
/*    public static int factorial(int n){
        int fact= 1;
        for(int i=1; i<=n; i++)
            fact *= i;
        System.out.println("Factorial of "+n+"! => "+fact);
        return fact;
    }*/

    public static BigInteger factorial(int n){
        BigInteger fact = BigInteger.ONE;
        for(int i=1; i<=n; i++)
            fact = fact.multiply(BigInteger.valueOf(i));
        System.out.println("Factorial of "+n+"! => "+fact);
        return fact;
    }

    public static int factorial(long n){
        int fact= 1;
        for(int i=1; i<=n; i++)
            fact *= i;
        System.out.println("Factorial of "+n+"! => "+fact);
        return fact;
    }
    public static int factorial(double n){
        int fact= 1;
        for(int i=1; i<=n; i++)
            fact *= i;
        System.out.println("Factorial of "+n+"! => "+fact);
        return fact;
    }

    public static void main(String[] args) {
        // leading to an integer overflow issue use BigInteger.
       BigInteger f = factorial(5);
        System.out.println(f.toString().length());
    }

}
