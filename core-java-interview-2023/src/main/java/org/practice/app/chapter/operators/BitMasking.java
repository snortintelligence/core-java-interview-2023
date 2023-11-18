package org.practice.app.chapter.operators;

/*
 *
 * Bit Masking is a technique in computer programming that involves manipulating individual bits in a binary number using bitwise operations
 * (such as AND, OR, XOR, and shifting) to achieve specific goals. It is commonly used for tasks like setting, clearing,
 * or checking the status of specific bits within an integer or other binary data.
 *
 * */
public class BitMasking {
    public static void main(String[] args) {
        System.out.println("====Bit Masking===");
        // Set the 3rd bit (counting from the right) to 1
        int num = 10; //Binary - 1010
        int mask = 1<<2; // Multiplying 1 * (2^2) => 4 => Binary data = 0100
        int result = num | mask; // 1010 | 0100 => 1110
        System.out.println(result);
        result = num & mask; // 1010 | 0100 => 0000
        System.out.println(result);

        System.out.println(~(1 << 1));

    }
}