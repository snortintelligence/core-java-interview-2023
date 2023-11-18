package org.practice.app.chapter.operators;

public class BitwiseOp {
    public static void main(String[] args) {
        System.out.println("\nAND & Operator ");
        System.out.println(1&1);
        System.out.println(1&0);
        System.out.println(0&1);
        System.out.println(0&0);

        System.out.println("\nInclusive OR | Operator ");
        System.out.println(1|1);
        System.out.println(1|0);
        System.out.println(0|1);
        System.out.println(0|0);

        System.out.println("\nExclusive OR ^ Operator ");
        System.out.println(1^1);
        System.out.println(1^0);
        System.out.println(0^1);
        System.out.println(0^0);

        System.out.println("\nNOt ! Operator ");
        System.out.println(!true);
        System.out.println(!false);

        System.out.println("\nInverse ~ Operator ");
        //The tilde (~) operator in many programming languages, including JavaScript, is a bitwise NOT operator.
        // It inverts the bits of an integer, changing 0 bits to 1 and 1 bits to 0.
        // Original binary representation of 5: 00000000000000000000000000000101
        //Bitwise NOT (~5): 11111111111111111111111111111010 when interpreted as a 32-bit signed integer, is -6.
        System.out.println("~7 => "+(~7)); // is equivalent to -6

        System.out.println(~1);
        System.out.println(~0);





    }
}
