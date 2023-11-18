package org.practice.app.chapter.dsa.bitset;

import java.util.BitSet;

/*
* In Java, the BitSet class is a useful data structure for working with a set of bits or binary data.
* You can use BitSet to perform various operations on bits, such as setting, clearing, toggling,
* and checking the status of individual bits.
*
* */
public class BitSetApp {
    public static void main(String[] args) {
        BitSet bitSet = new BitSet();
        System.out.println(bitSet);
        System.out.println("bitSet length : "+bitSet.length());
        System.out.println("bitSet size : "+bitSet.size());
        System.out.println("bitSet cardinality :"+bitSet.cardinality());
        System.out.println("bitSet.get(0) : "+bitSet.get(0));
        System.out.println("bitSet.get(0,3) : "+bitSet.get(0,3));
        System.out.println("bitSet.nextSetBit(0) : "+bitSet.nextSetBit(0));
        System.out.println("bitSet isEmpty : "+bitSet.isEmpty());


        //Setting and Clearing Bits:
        System.out.println("\n==== Setting, Getting and Clearing Bits ====");
        bitSet.set(0); // Set bit at index 0 to 1
        bitSet.set(2); // Set bit at index 2 to 1


        System.out.println("bitSet size : "+bitSet.size());
        System.out.println("bitSet length : "+bitSet.length());
        System.out.println("bitSet cardinality :"+bitSet.cardinality()); //Returns the number of bits set to true in this BitSet.

        System.out.println("bitSet.get(0) : "+bitSet.get(0));  // Check if bit at index 0 is set (1) or not (0)
        System.out.println("bitSet.get(1) : "+bitSet.get(1));// Check if bit at index 1 is set (1) or not (0)
        System.out.println("bitSet.get(2) : "+bitSet.get(2)); // Check if bit at index 2 is set (1) or not (0)
        System.out.println("bitSet.get(0,3) : "+bitSet.get(0,3));
        System.out.println("bitSet.nextSetBit(0) : "+bitSet.nextSetBit(0));

        System.out.println("\nIterating Over Set Bits");
        //Iterating Over Set Bits
        for (int i = bitSet.nextSetBit(0); i>=0; i = bitSet.nextSetBit(i+1)){
            System.out.println("Set bit at index bitSet.get("+i+") => " + bitSet.get(i));
        }

        bitSet.clear(2);  // Clear bit at index 2 (set to 0)
        System.out.println("\nafter clear a bit ");
        for (int i = bitSet.nextSetBit(0); i>=0; i = bitSet.nextSetBit(i+1)){
            System.out.println("Set bit at index bitSet.get("+i+") => " + bitSet.get(i));
        }


    }
}
