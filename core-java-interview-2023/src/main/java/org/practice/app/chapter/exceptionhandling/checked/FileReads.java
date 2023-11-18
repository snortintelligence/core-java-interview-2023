package org.practice.app.chapter.exceptionhandling.checked;

import java.io.*;

/*
*
* In a regular "try-catch" block, you manually open and close resources, and you handle exceptions explicitly.
* You are responsible for closing the resource in a "finally" block to ensure proper cleanup.
*
* Advantages:
Fine-grained control over resource management.
You can handle exceptions and cleanup logic separately.
*
* Disadvantages:
Code can become verbose due to manual resource management.
Easy to forget to close the resource, leading to resource leaks.
*
* */
public class FileReads {
    public static void main(String[] args) {
        BufferedReader br = null;
        String csvFile = "src/employee.csv";
        try {
          br =  new BufferedReader(new FileReader(csvFile));
          String lines = null;
          while((lines=br.readLine())!=null){
              System.out.println(lines);
          }
        }catch (IOException e) {
            throw new RuntimeException(e);
        }finally {
            if(br!=null){
                try {
                    br.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
