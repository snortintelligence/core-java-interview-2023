package org.practice.app.chapter.operators;

public class RLShiftOp {
    public static void main(String[] args) {

        //any divide by 2
        System.out.println("divided by 2");
        System.out.println(5/2);
        //Right Shift op by 1 time - does dividing by 2
        System.out.println(5>>1);
        System.out.println(6>>1);
        System.out.println();
        //When you right-shift a number, each shift to the right effectively
        //divides the number by 2 raised to the power of the shift amount.

        //Right Shift op by 2 time -
        System.out.println("divided by 4");
        System.out.println(5>>2); // it's equivalent to dividing 5 by 2^2, which is 4.
        System.out.println(6>>2); // it's equivalent to dividing 6 by 2^2, which is 4.
        System.out.println(8>>2); // it's equivalent to dividing 8 by 2^2, which is 4.
        System.out.println();

        System.out.println("divided by 8");
        System.out.println(16>>3); // it's equivalent to dividing 5 by 2^2^2, which is 8.
        System.out.println(64>>3); // it's equivalent to dividing 6 by 2^2^2, which is 8.
        System.out.println(8>>3); // it's equivalent to dividing 8 by 2^2^2, which is 8.
        System.out.println();

        System.out.println("divided by 16");
        System.out.println(16>>4); // it's equivalent to dividing 16 by 2^2^2^2, which is 16.
        System.out.println(64>>4); // it's equivalent to dividing 64 by 2^2^2^2, which is 16.
        System.out.println(48>>4); // it's equivalent to dividing 8 by 2^2^2^2, which is 16.
        System.out.println();


        //any number multiplies by 2
        System.out.println("multiplication by 2");
        System.out.println(2*2);
        //Left Shift op by 1 time - does multiply by 2
        System.out.println(2<<1);
        System.out.println(5<<1);
        System.out.println(6<<1);
        System.out.println();

        System.out.println("multiplication by 2^2");
        //Left Shift op by 1 time - does multiply by 2^2
        System.out.println(2<<2);
        System.out.println(5<<2);
        System.out.println(6<<2);
        System.out.println(1<<2);
        System.out.println();

        findEvenOrOddNumber(new int[]{22,33,44,55,66,2,1,3,11,14});
        swap(5,7);
        //5 : 101
        //7 : 111
    }

    public static void findEvenOrOddNumber(int arr[]){
        for (int x: arr){
            if((x&1)==0){
                System.out.println("EVEN Number : "+x);
            }else{
                System.out.println("ODD Number : "+x);
            }
            System.out.println();
        }
    }

    public static void swap(int a, int b){
        System.out.println("value in a : "+a+" , b : "+b);
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        System.out.println("=== After swapped ===");
        System.out.println("value in b : "+b);
        System.out.println("value in a : "+a);
    }

}
