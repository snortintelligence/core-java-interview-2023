package org.practice.app.chapter.dsa.arrays.matrices;

public class TriangularMatrix {
    public static void main(String[] args) {
        int[][] upper_triangularMatrix = {
                {4,5,6},
                {0,7,8},
                {0,0,9}
        };
        int[][] lower_triangularMatrix = {
                {4,0,0},
                {1,1,0},
                {1,1,9}
        };
        System.out.println("\nUpper Triangular Matrix : ");
        showMatrix(upper_triangularMatrix);
        System.out.println("\nLower Triangular Matrix : ");
        showMatrix(lower_triangularMatrix);
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
