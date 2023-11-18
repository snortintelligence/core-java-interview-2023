package org.practice.app.chapter.dsa.arrays.matrices;

public class ScalarMatrix {
    public static void main(String[] args) {
        //Scalar Matrix (Identity Matrix): A scalar matrix, also known as an identity matrix, is a special type of diagonal matrix where all diagonal elements are equal to 1 or same.
        int[][] scalarMatrix = {
                {2,0,0},
                {0,2,0},
                {0,0,2}
        };
        showMatrix(scalarMatrix);
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
