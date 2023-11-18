package org.practice.app.companywise.sail;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CheckedExceptionApp {
    public static void main(String[] args) throws FileNotFoundException {
        //Checking : resources must be available
        try (BufferedReader reader = new BufferedReader(new FileReader("src2/ihelp.txt"))) {
            System.out.println(reader.readLine());
        } catch (IOException e) {
            System.out.println("Exception :: "+e.getClass());

        }
    }
}
