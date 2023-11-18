package org.practice.app.chapter.collections.set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class UniqueData {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter array size : ");
        int N = s.nextInt();
        int num[] = new int[N];
        HashSet<Integer> unqNum = new HashSet();
        for(int i=0; i<N; i++){
            System.out.println("Enter no : ");
            num[i] = s.nextInt();
            unqNum.add(num[i]);
        }

        System.out.println("size : "+unqNum.size());
        System.out.println("unqNum : "+unqNum);

    }
}
