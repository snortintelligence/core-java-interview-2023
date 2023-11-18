package org.practice.app.chapter.java8.functionalf3;

import org.practice.app.chapter.java8.interfacef1.Vehicle;

import java.lang.reflect.Array;
import java.util.*;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

//Lambda Expression represents a Functional interface rather than Anonymous class obj
public class LambdaExpression2 {
    public static void main(String[] args) {

        //Function interface
        List<Integer> num = Arrays.asList(1,3,4,2,5, -10, -9);
        //  1. Function :  Represents a function that accepts one argument and produces a result.
        Function<List<Integer> , List<Integer>> findEvenList = (list)-> {
            List<Integer> evenList = new ArrayList<>();
            for (Integer n : list){
            if (n%2==0){
                evenList.add(n);
            }
          }
            return evenList;
        };

        Function<List<Integer> , List<Integer>> findEvenListByStream = (list)-> {
            return list.stream().filter(n->n%2==0).collect(Collectors.toList());
        };

        //System.out.println(findEvenList.apply(num));
        System.out.println("Even num[] : ");
        System.out.println(findEvenListByStream.apply(num));

        System.out.println("Odd num[] : ");
        Function<List<Integer> , List<Integer>> findOddList = (list)-> list.stream().filter(n->n%2==1).collect(Collectors.toList());
        System.out.println(findOddList.apply(num));


        //2. Predicate : Represents a predicate (boolean-valued function) of one argument.
        Predicate<Integer> isNegative = (n-> n < 0);

        //Collect negative nos.
        Function<List<Integer> , List<Integer>> findNegList = list->list.stream().filter(isNegative).collect(Collectors.toList());
        System.out.println("Negative num[]");
        System.out.println(findNegList.apply(num));

        Optional<Integer> min = num.stream().min(Integer::compareTo);
        if(min.isPresent()){
            System.out.println("Min value : "+ min.get());
        }else{
            System.out.println("Min value List is empty");
        }

        Optional<Integer> max = num.stream().max(Integer::compareTo);
        if(max.isPresent()){
            System.out.println("max value : "+ max.get());
        }else{
            System.out.println("max value List is empty");
        }

//        List<Integer> sortedNum = num.stream().sorted().collect(Collectors.toList());
        List<Integer> sortedNum = num.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println(sortedNum);



    }
}
