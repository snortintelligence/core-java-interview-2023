package org.practice.app.chapter.dsa.arrays.matrices;

public class RowMatrix {
    public static void main(String[] args) {
        //A row matrix is a matrix with only one row and multiple columns. It is also known as a row vector.
        int rowMatrix[] = {10,20,30,40};
        System.out.println("Row Matrix : ");
        for (int i = 0; i < rowMatrix.length; i++) {
            System.out.print(rowMatrix[i]+" ");
        }
    }
}
