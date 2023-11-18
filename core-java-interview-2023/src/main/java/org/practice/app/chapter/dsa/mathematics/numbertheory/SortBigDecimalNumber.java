package org.practice.app.chapter.dsa.mathematics.numbertheory;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;

public class SortBigDecimalNumber {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter n inputs : ");
        int n=sc.nextInt();
        String []s=new String[n+2];
        for(int i=0;i<n;i++){
            System.out.println("Enter number(str) : ");
            s[i]=sc.next();
        }
        sc.close();
        //Output

        // Remove any null values from the array
        s = Arrays.stream(s)
                .filter(str -> str != null)
                .toArray(String[]::new);


        //Write your code here - ASC
       // Arrays.sort(s, (a, b)-> new BigDecimal(a).compareTo(new BigDecimal(b)));
        Arrays.sort(s, (a, b)-> new BigDecimal(b).compareTo(new BigDecimal(a)));

        for(int i=0;i<n;i++)
        {
            System.out.println(s[i]);
        }
    }
}
