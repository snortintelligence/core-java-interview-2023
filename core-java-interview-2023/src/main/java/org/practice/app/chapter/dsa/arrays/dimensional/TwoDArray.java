package org.practice.app.chapter.dsa.arrays.dimensional;

import java.util.Scanner;

public class TwoDArray {
    public static void main(String[] args) {
        //create an array of 3 rows & 3 columns
        int[][] num1 = new int[3][3];
        Scanner s = new Scanner(System.in);
        System.out.println("Enter data for 3 x 3 arr[][] = ");
        for (int r=0; r<3; r++){
            //filling the row value
            for (int c=0; c<3; c++){
                num1[r][c] = s.nextInt();
            }
        }

        for (int r = 0; r < 3; r++) {
            for (int c = 0; c < 3 ; c++) {
                System.out.println("value at num["+r+"]["+c+"] = "+(num1[r][c]));
            }
        }
        System.out.println("Enter searching number( x=? ) : ");
        int x = s.nextInt();
        //find matrix index for given value
        for (int r=0; r<3; r++){
            //filling the row value
            for (int c=0; c<3; c++){
                if(num1[r][c]==x){
                    System.out.println("x value present at location ("+r+","+c+") = "+x);
                }
            }
        }

    }
}
