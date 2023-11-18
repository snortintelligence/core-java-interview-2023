package org.practice.app.chapter.dsa.searching.sorting;

public class InsertionSort {
    public static int[] insertionSort(int arr[]){
        for(int i=1; i<arr.length; i++){
            int current = arr[i];
            int j = i-1;
            while(j >= 0 && current < arr[j]){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = current;
        }
        return arr;
    }

    public static void main(String[] args) {
        int sorted[] = insertionSort(new int[]{3,2,1});
        for (int n:sorted) {
            System.out.print(n+" ");
        }
    }
}
