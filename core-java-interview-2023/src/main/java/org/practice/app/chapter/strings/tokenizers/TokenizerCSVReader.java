package org.practice.app.chapter.strings.tokenizers;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class TokenizerCSVReader {
    public static void main(String[] args) {
        String csvFile = "src/employee.csv";
        boolean skipHeader = true;
        List<Employee> employees = new ArrayList<>();
        try(BufferedReader bufferedReader = new BufferedReader(new FileReader(csvFile))){
                String line="";
                while((line=bufferedReader.readLine())!= null){
                    //after single reading line of text split into multiple words using a comma (,) as the delimiter
                    if (skipHeader) {
                        skipHeader = false;
                        continue; // Skip the header line and continue to the next line
                    }
                    StringTokenizer tokenizer = new StringTokenizer(line, ",");
                   if(tokenizer.countTokens()==3){
                       String name = tokenizer.nextToken().trim();
                       String job = tokenizer.nextToken().trim();
                       String salary = tokenizer.nextToken().trim();
                       employees.add(new Employee(name, job, Double.parseDouble(salary)));
                   }
                }
        }catch (IOException e){
            e.printStackTrace();
        }
        employees.forEach((emp)-> System.out.println(emp));
    }
}
