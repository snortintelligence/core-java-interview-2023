package org.practice.app.chapter.strings.tokenizers;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class StringTokenizerCSVReader {
    public static void main(String[] args) {
        String csvFile = "src/employee.csv";
        try(BufferedReader bufferedReader = new BufferedReader(new FileReader(csvFile))){
                String line="";
                while((line=bufferedReader.readLine())!= null){
                    //after single reading line of text split into multiple words using a comma (,) as the delimiter
                    StringTokenizer tokenizer = new StringTokenizer(line, ",");
                    while(tokenizer.hasMoreTokens()){
                        String token = tokenizer.nextToken().trim();
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
