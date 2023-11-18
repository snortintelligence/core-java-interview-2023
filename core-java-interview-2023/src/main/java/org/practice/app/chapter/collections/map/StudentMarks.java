package org.practice.app.chapter.collections.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class StudentMarks {
    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        Scanner s = new Scanner(System.in);
        Map<String, Integer> examDb = new HashMap<>();
        System.out.println("Enter no. of entries you want : ");
        int A = s.nextInt(); //number of entries
        String name = "";
        int marks = 0;
        s.nextLine();

        //go for Enteries
        for(int i=0; i < A; i++ ){
            //take input name, marks
            System.out.println("Enter name : ");
            name = s.nextLine();
            System.out.println("Enter marks : ");
            marks = s.nextInt();
            s.nextLine();
            examDb.put(name, marks);
        }

        System.out.println("Enter no. of queries you want : ");
        int Q = s.nextInt(); //Q denoting the number of queries.
        s.nextLine();
        //go for queries
        for(int i=0; i < Q; i++ ){
            System.out.println("Enter query name : ");
            name = s.nextLine();
            if(examDb.containsKey(name)){
                System.out.println(examDb.get(name));
            }else{
                System.out.println("Not Found");
            }
        }
    }
}
