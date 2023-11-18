package org.practice.app.chapter.dsa.mathematics.numbertheory;

public class PalindromeNumber {
    public static boolean palindrome(long num){
        long n = num;
        long rem=0, rev=0;

        while (num>0){
            System.out.println("............");
            rem = num%10;
            num = num/10;
            rev = rev * 10 + rem;
        }
        return rev==n ? true : false;
    }
    public static void main(String[] args) {
        System.out.println("palindrome : "+palindrome(404));
    }
}
