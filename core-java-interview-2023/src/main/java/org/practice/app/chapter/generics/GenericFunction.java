package org.practice.app.chapter.generics;

public class GenericFunction {
    public static <T extends Comparable<T>> T findMax(T[] arr){
        if(arr==null || arr.length == 0){
            return null;
        }
        T max = arr[0];
        for (T val: arr) {
            if(val.compareTo(max)>0){
                max = val;
            }
        }
        return max;
    }
}
