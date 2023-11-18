package org.practice.app.chapter.dsa.mathematics.numbertheory;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.MathContext;
import java.math.RoundingMode;

/*
*
* The BigDecimal class provides operations on double numbers for arithmetic, scale handling, rounding, comparison, format conversion and hashing.
*
* */

public class BigDecimalApp {
    public static void main(String[] args) {
        System.out.println("\nValue assigning : ");
        BigDecimal bigDecimal = new BigDecimal(45);
        System.out.println("int value : "+bigDecimal.toBigInteger());
        bigDecimal = BigDecimal.valueOf(33.0);
        System.out.println("double value : "+bigDecimal.doubleValue());

        System.out.println("\nNumbers comparison : ");
        //-1, 0, or 1 as this BigDecimal is numerically less than, equal to, or greater than val.
        //In this case, since 49 is less than 50, the compareTo method will return a negative value (typically -1)
        System.out.println("less than => "+BigDecimal.valueOf(49).compareTo(BigDecimal.valueOf(50)));
        //In this case, since 50 is equals to 50, the compareTo method will return a 0 value (typically 0)
        System.out.println("equals to => "+BigDecimal.valueOf(50).compareTo(BigDecimal.valueOf(50)));
        //In this case, since 55 is greater than 52, the compareTo method will return a 1 value (typically 1)
        System.out.println("greater than => "+BigDecimal.valueOf(55).compareTo(BigDecimal.valueOf(52)));
        System.out.println("Object equals to => "+BigDecimal.valueOf(50).equals(BigDecimal.valueOf(50)));
        System.out.println("min => "+BigDecimal.valueOf(50).min(BigDecimal.valueOf(1)));
        System.out.println("max => "+BigDecimal.valueOf(50).max(BigDecimal.valueOf(1)));

        System.out.println("\nArithmetic Operations : ");
        System.out.println("add : "+ BigDecimal.valueOf(10).add(BigDecimal.valueOf(20)));
        System.out.println("subtract : "+ BigDecimal.valueOf(100).subtract(BigDecimal.valueOf(20)));
        System.out.println("multiply : "+ BigDecimal.valueOf(10).multiply(BigDecimal.valueOf(2)));
        System.out.println("divide : "+ BigDecimal.valueOf(100).divide(BigDecimal.valueOf(20)));
        System.out.println("remainder : "+ BigDecimal.valueOf(101).remainder(BigDecimal.valueOf(20)));

        //The absolute value of a number is its value without regard to its sign. In other words, it gives you the positive magnitude of a number.
        BigDecimal number = new BigDecimal("-123.456");
        System.out.println("original number : "+ number);
        System.out.println("absolute number : "+ number.abs());

        // add vs plus
        System.out.println("\nadd vs plus");
        BigDecimal n1 = BigDecimal.valueOf(1);
        BigDecimal n2 = BigDecimal.valueOf(1.005);

        // Using the 'add' method with precision and rounding control
        BigDecimal result = n1.add(n2, new MathContext(2, RoundingMode.HALF_UP));
        System.out.println("Initial Number: " + n1);
        System.out.println("Addend: " + n2);
        System.out.println("Result (using 'add' with precision and rounding control): " + result);

    }
}
