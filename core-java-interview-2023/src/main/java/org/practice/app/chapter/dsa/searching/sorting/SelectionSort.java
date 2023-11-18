package org.practice.app.chapter.dsa.searching.sorting;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] sortedData = selectionSort(new int[]{33,7,1,2,3});
        for (int x: sortedData) {
            System.out.print(x+" ");
        }
    }

    public static int[] selectionSort(int[] arr){
        int n = arr.length;
        for(int i=0; i<n-1; i++){
            //select smallest index
            int smallest = i;
            //j=i+1 , select next index to compare with previous index i
            for (int j=i+1; j<n; j++){
                if(arr[j] < arr[smallest]){
                    smallest = j;
                }
            }//end of inner loop
            int temp = arr[smallest];
            arr[smallest] = arr[i];
            arr[i] = temp;
        }//end of outer loop
        return arr;
    }

}
