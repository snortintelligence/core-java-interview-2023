package org.practice.app.chapter.dsa.arrays.matrices;

public class MatrixTranspose {
    //https://www.youtube.com/watch?v=5o2gb73r7Zs
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

//        traverseMatrix(matrix);
        traverseMatrixColumnWise(matrix);
    }

    public static void traverseMatrix(int[][] matrix){
        int noOfRows = matrix.length;
        int noOfCols = matrix[0].length;

        for (int row=0; row<noOfRows; row++){
            System.out.println("Row_th No. => "+(row)+"\n");
                for (int col=0; col<noOfCols; col++){
                    System.out.println("matrix["+row+"]["+col+"] == "+matrix[row][col]);
                }
            System.out.println();
        }
    }

    public static void traverseMatrixColumnWise(int[][] matrix){
        int noOfRows = matrix.length;
        int noOfCols = matrix[0].length;
        for (int col=0; col<noOfCols; col++){
            System.out.println("Column_th No. => "+(col)+"\n");
            for (int row=0; row<noOfRows; row++){
                System.out.println("matrix["+row+"]["+col+"] == "+matrix[row][col]);
            }
            System.out.println();
        }
    }
}
