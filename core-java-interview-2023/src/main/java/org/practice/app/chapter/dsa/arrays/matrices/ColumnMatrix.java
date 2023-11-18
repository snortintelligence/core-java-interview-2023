package org.practice.app.chapter.dsa.arrays.matrices;

public class ColumnMatrix {
    public static void main(String[] args) {
        //Column Matrix: A column matrix is a matrix with only one column and multiple rows. It is also known as a column vector.
        int[][] columnMatrix = {
                {1},{2},{3},{44}
        };

        System.out.println("Column Matrix : ");
        for (int row = 0; row < columnMatrix.length; row++) {
            for (int col = 0; col < columnMatrix[0].length; col++) {
                System.out.println(columnMatrix[row][col]);
            }
        }

    }
}
