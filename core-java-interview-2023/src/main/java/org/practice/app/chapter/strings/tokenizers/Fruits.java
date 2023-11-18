package org.practice.app.chapter.strings.tokenizers;

import java.util.Arrays;
import java.util.Iterator;
import java.util.StringTokenizer;

public class Fruits {
    public static void main(String[] args) {
        String fruits = "apple,banana,guava";
        StringTokenizer tokenizer = new StringTokenizer(fruits, ",");
        String[] fruitsArr = fruits.split(",");
        int totalFruitsCount = 0;

        System.out.println("=====StringTokenizer====");
        totalFruitsCount = tokenizer.countTokens();
        System.out.println("totalFruitsCount = "+totalFruitsCount);
        String nextToken = tokenizer.nextToken().trim();
        System.out.println("nextToken = "+nextToken);
        Object nextElement = tokenizer.nextElement();
        System.out.println("nextElement = "+nextElement);

        Iterator<Object> fruitsIterator = tokenizer.asIterator();
        fruitsIterator.forEachRemaining((value)-> System.out.println(value));
        System.out.println("\n=====String====");
        System.out.println("fruitsArr.length = "+fruitsArr.length);
        for (String fruit : fruitsArr) {
            System.out.println(fruit);
        }

    }
}
