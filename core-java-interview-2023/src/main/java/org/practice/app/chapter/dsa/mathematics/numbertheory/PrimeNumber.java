package org.practice.app.chapter.dsa.mathematics.numbertheory;

import java.math.BigInteger;
import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String n=sc.nextLine();
        sc.close();
        if(isPrime(new BigInteger(n))){
            System.out.println("prime");
        }else{
            System.out.println("not prime");
        }
    }

    public static boolean isPrime(BigInteger number) {
        // Check for special cases
        if (number.compareTo(BigInteger.ONE) <= 0) {
            return false; // 0 and 1 are not prime
        } else if (number.compareTo(new BigInteger("2")) <= 0) {
            return true; // 2 is prime
        }

        // Check for divisibility by numbers from 2 to the square root of the number
        long sqrtNum = (long) Math.sqrt(number.longValue());

        BigInteger sqrt = new BigInteger(sqrtNum+"");

        for (BigInteger i = new BigInteger("2"); i.compareTo(sqrt) <= 0; i = i.add(BigInteger.ONE)) {
            if (number.mod(i).equals(BigInteger.ZERO)) {
                return false; // Found a divisor, not prime
            }
        }

        return true; // No divisors found, prime
    }
}
