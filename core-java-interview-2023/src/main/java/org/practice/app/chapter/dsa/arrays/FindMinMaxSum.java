package org.practice.app.chapter.dsa.arrays;

public class FindMinMaxSum {
    public static void main(String[] args) {
        System.out.println("sum = "+findMinMaxSum(new int[]{1, 3, 4, 1}));
        System.out.println("sum = "+findMinMaxSum2(new long[]{1, 3, 4, 1}));
    }
    public static int findMinMaxSum(int[] numArr){
        int min = numArr[0];
        int max = numArr[0];
        int totCom = 0;

        for(int i=0; i<numArr.length; i++){
            if(min<numArr[i]){
                min=numArr[i];
            }
            if(max>numArr[i]){
                max=numArr[i];
            }
            totCom = i;
        }
        System.out.println("Total comparision = "+totCom);

        return min+max;
    }
    public static long findMinMaxSum2(long[] numArr){
        long min = numArr[0];
        long max = numArr[0];
        long totalSum = 0;
        int totCom = 0;

        for(int i=0; i<numArr.length; i++){
            totalSum += numArr[i];
            if(numArr[i]<min){
                    min = numArr[i];
            } else if(numArr[i]>max){
                max = numArr[i];
            }

            totCom = i;

        }
        System.out.println("Max = "+max+", Min = "+min);
        System.out.println("Total comparision = "+totCom);
        return min+max;
    }
}
