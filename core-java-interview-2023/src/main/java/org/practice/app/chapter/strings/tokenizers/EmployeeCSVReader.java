package org.practice.app.chapter.strings.tokenizers;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class EmployeeCSVReader {
    public static void main(String[] args) {
        String csvFile = "src/employee.csv";
        List<Employee> employees = new ArrayList<>();
        try(BufferedReader bufferedReader = new BufferedReader(new FileReader(csvFile))){
                String line="";
                while((line=bufferedReader.readLine())!= null){
                    //after single reading line of text split into multiple words using a comma (,) as the delimiter
                    String values[] = line.split(",");
                    for(String value: values){
                        String token = value.trim();
                        // Process each token (e.g., print or store in a data structure)
                        System.out.println(token+" | ");
                    }
                    System.out.println(); // Move to the next line for the next CSV record
                }
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
