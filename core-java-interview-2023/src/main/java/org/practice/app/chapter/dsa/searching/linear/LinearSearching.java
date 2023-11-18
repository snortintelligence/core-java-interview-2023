package org.practice.app.chapter.dsa.searching.linear;

public class LinearSearching {
    public static int findElement(int arr[], int target){
        //Linear search is often used when the data is not sorted.
        //You iterate through the array until you find the element or reach the end.
        for (int i=0; i<arr.length; i++){
            if(arr[i]==target)
                return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(findElement(new int[]{1,2,3,4},5));
    }
}
