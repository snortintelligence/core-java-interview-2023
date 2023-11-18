package org.practice.app.companywise.eidiko;

public class FindPrimeNo {

    //2 functions --> prime checker , primePrinter

    public static boolean isPrime(int num){
        if(num<=1) {
            return false;
        }
        for (int i=2; i <= Math.sqrt(num); i++){
            if(num%i==0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int limit = 50;
        for (int i = 2; i <=limit ; i++) {
            if (isPrime(i)){
                System.out.println(i+" is a prime number.");
            }
        }
    }
}
