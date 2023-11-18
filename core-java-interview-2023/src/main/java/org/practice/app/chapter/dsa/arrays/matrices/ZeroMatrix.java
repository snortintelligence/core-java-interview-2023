package org.practice.app.chapter.dsa.arrays.matrices;

public class ZeroMatrix {
    public static void main(String[] args) {
        int[][] zeroMatrix = {
                {0,0,0},
                {0,0,0}
        };
        showMatrix(zeroMatrix);
    }
    public static void showMatrix(int[][] matrix){
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[0].length; col++) {
                System.out.print(matrix[row][col]+" ");
            }
            System.out.println();
        }
    }
}
