package org.practice.app.chapter.dsa.arrays.matrices;

public class SquareMatrix {
    public static void main(String[] args) {
        //A square matrix is a matrix in which the number of rows is equal to the number of columns (n × n). Square matrices are commonly used in various mathematical operations.
        int[][] squareMatrix =  {
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16}
        };
        int M = squareMatrix.length;
        int N = squareMatrix[0].length;
        if(M==N){
            System.out.println("It is Square Matrix["+M+"]["+N+"].");
        }else{
            System.out.println("It is not a Square Matrix["+M+"]["+N+"].");
        }

    }
}
