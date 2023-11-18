package org.practice.app.chapter.strings.tokenizers;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class EmployeeCSVStorage {
    public static void main(String[] args) {
        String csvFile = "src/employee.csv";
        boolean skipHeader = true; // Flag to skip the header line in first iteration
        List<Employee> employees = new ArrayList<>();
        try(BufferedReader bufferedReader = new BufferedReader(new FileReader(csvFile))){
                String line="";
                while((line=bufferedReader.readLine())!= null){
                    if (skipHeader) {
                        skipHeader = false;
                        continue; // Skip the header line and continue to the next line
                    }
                    //after single reading line of text split into multiple words using a comma (,) as the delimiter
                    String values[] = line.split(",");
                    if(values.length==3){
                        employees.add(new Employee(values[0].trim(), values[1].trim(), Double.parseDouble(values[2].trim())));
                    }
                    System.out.println(); // Move to the next line for the next CSV record
                }
        }catch (IOException e){
            e.printStackTrace();
        }
        System.out.println(employees);
    }
}
