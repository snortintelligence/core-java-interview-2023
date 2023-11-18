package org.practice.app.chapter.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IOApplication {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.valueOf(bufferedReader.readLine());
        int b = Integer.valueOf(bufferedReader.readLine());
        System.out.println(a);
        System.out.println(b);
    }
}
