package org.practice.app.chapter.dsa.arrays.matrices;

import org.apache.commons.math3.linear.LUDecomposition;
import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.SingularMatrixException;

public class SingularMatrix {
    public static void main(String[] args) {
        double[][] matrix = {
                {2,4},
                {1,2}
        };
        // |A| = 2x2 - 1x4 = 0 then it is called SingularMatrix otherwise Non-SingularMatrix
        double A_Determinant = matrix[0][0] * matrix[1][1] - matrix[0][1] * matrix[1][0];
        System.out.println(A_Determinant==0 ? "It's a Singular Matrix" : "It's a Non-Singular Matrix.");

        matrix = new double[][]{
                {2, 4},
                {1, 4}
        };

        A_Determinant = matrix[0][0] * matrix[1][1] - matrix[0][1] * matrix[1][0];
        System.out.println(A_Determinant==0 ? "It's a Singular Matrix" : "It's a Non-Singular Matrix.");

        // note : In Java, you can calculate the determinant of a matrix using libraries like Apache Commons Math or you can implement your own determinant calculation algorithm.

        matrix = new double[][]{
                {3,8,1},
                {-4,1,1},
                {-4,1,1}
        };

        RealMatrix realMatrix = MatrixUtils.createRealMatrix(matrix);
        LUDecomposition luDecomposition = new LUDecomposition(realMatrix);
        try {
            double determinant = luDecomposition.getDeterminant();
            if (determinant == 0) {
                System.out.println("The matrix is singular (non-invertible).");
            } else {
                System.out.println("The matrix is non-singular (invertible).");
            }
        } catch (SingularMatrixException e) {
            System.out.println("The matrix is singular (non-invertible).");
        }

    }


}
