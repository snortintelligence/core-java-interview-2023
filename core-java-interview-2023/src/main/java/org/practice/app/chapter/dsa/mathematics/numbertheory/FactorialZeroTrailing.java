package org.practice.app.chapter.dsa.mathematics.numbertheory;

import java.math.BigInteger;
public class FactorialZeroTrailing {

    public static BigInteger factorialOfN(int num){
        BigInteger fact = BigInteger.ONE;
        for (int i=1; i<=num; i++){
            fact  = fact.multiply(BigInteger.valueOf(i));
        }
        System.out.println("Factorial of "+num+"! => "+fact);
        return fact;
    }

    public static int zeroTrailingCount(int factorialNum){
        //Brute-Force method
        //https://www.youtube.com/watch?v=aXzIJt4xaoo
        int num = factorialNum;
        int count = 0;
        while (factorialNum>0){
            if(factorialNum%10==0){
                count++;
                factorialNum = factorialNum/10;
            }else{ break; }
        }
        System.out.println("Total Zero(0) Trailing of "+num+" => "+count);
        return count;
    }

    public static int zeroTrailingCount(BigInteger factNum){
        BigInteger num = factNum;
        int count=0;
        while (factNum.compareTo(BigInteger.ZERO)>0){
            BigInteger[] divNReminder = factNum.divideAndRemainder(BigInteger.TEN);
            if(divNReminder[1].equals(BigInteger.ZERO)){
                count++;
                factNum = divNReminder[0];
            }else{
                break;
            }
        }
        System.out.println("Total Zero(0) Trailing => "+count);
        return count;
    }

    public static void main(String[] args) {
        BigInteger  f = factorialOfN(150);
        zeroTrailingCount(f);
    }
}
