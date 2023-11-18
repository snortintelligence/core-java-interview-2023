package org.practice.app.chapter.dsa.bitset;

import java.util.BitSet;

/*
* In Java, the BitSet class is a useful data structure for working with a set of bits or binary data.
* You can use BitSet to perform various operations on bits, such as setting, clearing, toggling,
* and checking the status of individual bits.
*
* */
public class BitSetApps {
    public static void main(String[] args) {
        // indices in the range 0 through nbits-1. All bits are initially false. 0 - 9
        BitSet b1 = new BitSet(10);
        BitSet b2 = new BitSet(10);

        for (int i=0; i<=9; i++){
            if(i%2==0){
                b1.set(i);
            }
            if(i%3==0) {
                b2.set(i);
            }
        }
        System.out.println("values in b1 : ");
        System.out.println(b1);
        System.out.println("values in b2 : ");
        System.out.println(b2);

        //AND Operations
        System.out.println("\nb1 AND b2 Operations : ");
        b1.and(b2);
        System.out.println(b1);
        System.out.println("\nb1 OR b2 Operations : ");
        b1.or(b2);
        System.out.println(b1);
        System.out.println("\nb1 XOR b2 Operations : ");
        b1.xor(b2);
        System.out.println(b1);


    }
}
