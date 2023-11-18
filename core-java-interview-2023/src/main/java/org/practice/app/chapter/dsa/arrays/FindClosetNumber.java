package org.practice.app.chapter.dsa.arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class FindClosetNumber {

    public static int findClosestNumber(int[] arr, int target){
        return Arrays.stream(arr)
                .boxed()
                .min((a,b)-> Integer.compare(Math.abs(a - target) , Math.abs(b-target)))
                .orElse(0);
    }

    public static void main(String[] args) {
        System.out.println(findClosestNumber(new int[]{6,2,4,10}, 7));
    }
}
