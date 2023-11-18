package org.practice.app.chapter.dsa.searching.sorting;

/*
 * When we say that bubble sort "compares adjacent elements," it means that the algorithm examines and compares pairs of neighboring elements
 * in the array while sorting. Specifically, it compares elements at index j and j+1, where j is the current index within the loop.
 *
 * Here's a breakdown of what happens during the comparison step in bubble sort:
 *
 * 1. The algorithm starts by comparing the first two elements of the array (index 0 and 1).
 * 2. If the element at index j is greater than the element at index j+1, a swap is performed to
 * rearrange them so that the smaller element is on the left (at index j), and the larger element is on the right (at index j+1).
 * 3. The algorithm then moves on to compare the next pair of adjacent elements (index 1 and 2),
 * and the process continues until it reaches the end of the array.
 * 4. After completing one pass through the array, the largest element "bubbles up" to the end of the
 * array (it moves to the last position). The largest element is now in its correct position.
 * 5. The process repeats for the remaining unsorted portion of the array (excluding the last element, which is already sorted).
 * 6. This process continues until no more swaps are needed during a pass, indicating that the entire array is sorted.
 *
 * In summary, "comparing adjacent elements" in bubble sort refers to the repeated comparison and, if necessary,
 * swapping of neighboring elements to gradually move the largest elements to the end of the array, resulting in a sorted array.
 *
 * */

public class BubbleSort {

    public static void main(String[] args) {
        int x[] = bubbleSort(new int[]{3,2,6,1});
        int y[] = bubbleSortByDescOrder(new int[]{3,2,6,1});

        System.out.println("\nbubbleSortBy Asc Order : ");
        for (int n: x) {
            System.out.print(n);
        }
        System.out.println("\nbubbleSortBy Desc Order :");
        for (int n: y) {
            System.out.print(n);
        }
    }
    public static int[] bubbleSort(int arr[]) {
        int length = arr.length;
        boolean swapped;
        for(int i=1; i<length; i++){
            //go for passes
            swapped = false;
            for (int j=0; j < length-1; j++){
                //comparing 2 elements
                if(arr[j]> arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swapped = true;
                }
            }
            if(!swapped){
                break;
            }
        }
        return arr;
    }//end of bubbleSort

    public static int[] bubbleSortByDescOrder(int arr[]) {
        int length = arr.length;
        boolean swapped;
        for(int i=1; i<length; i++){
            //go for passes
            swapped = false;
            for (int j=0; j < length-1; j++){
                //comparing 2 elements
                if(arr[j] < arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swapped = true;
                }
            }
            if(!swapped){
                break;
            }
        }
        return arr;
    }//end of bubbleSort

}
