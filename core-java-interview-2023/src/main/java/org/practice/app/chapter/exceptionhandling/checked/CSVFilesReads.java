package org.practice.app.chapter.exceptionhandling.checked;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/*
*
* With the "try-with-resources" statement introduced in Java 7, resource management is more convenient.
* The Java runtime automatically takes care of closing the resource when the "try" block exits,
* whether it exits normally or due to an exception
*
* Advantages:
Automatic resource management, reducing the chance of resource leaks.
Cleaner and more concise code.
Disadvantages:

Limited to resources that implement the AutoCloseable interface.
May not be suitable for situations requiring custom resource management logic.
*
* */
public class CSVFilesReads {
    public static void main(String[] args) {
        String csvFile = "src/employee.csv"; //resource to open and close
        try(BufferedReader br = new BufferedReader(new FileReader("src/employee.csv"))){
            String lines = null;
            while
            ((lines = br.readLine())!=null){
                System.out.println(lines);
            }
        }catch (Exception e){
            System.out.println(e);
        }finally {
            System.out.println("Finally block-executed");
        }
    }
}
