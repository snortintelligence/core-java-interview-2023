package org.practice.app.chapter.dsa;

import java.util.ArrayList;
import java.util.Scanner;

public class ListApp {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        ArrayList<Integer> numList = new ArrayList<Integer>();
        int num = 0;
        while(true){
            System.out.println("Enter a number : ");
            num = s.nextInt();
            if(num>=0){
                numList.add(num);
            }else{
                break;
            }
        }

        for (int i = numList.size()-1; i>=0 ; i--) {
            System.out.print(numList.get(i)+" ");
        }

    }
}
