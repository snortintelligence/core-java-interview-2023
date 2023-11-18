package org.practice.app.chapter.dsa.arrays.matrices;

public class DiagonalMatrix {
    public static void main(String[] args) {
        int[][] diagonalMatrix = {
                {1,0,0},
                {0,4,0},
                {0,0,7}
        };
        System.out.println(diagonalMatrix.length);
        showMatrix(diagonalMatrix);

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
