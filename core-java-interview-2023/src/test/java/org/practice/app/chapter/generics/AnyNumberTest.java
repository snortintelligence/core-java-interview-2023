package org.practice.app.chapter.generics;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnyNumberTest {

    @Test
    void test_Integer_Numbers_Sum(){
        AnyNumber<Integer> a = new AnyNumber<>(10);
        AnyNumber<Integer> b = new AnyNumber<>(10);
        Integer sum = a.getNumber() + b.getNumber();
        Assertions.assertEquals(sum, 20);
    }

    @Test
    void test_Integer_Numbers_Subtract(){
        AnyNumber<Integer> a = new AnyNumber<>(10);
        AnyNumber<Integer> b = new AnyNumber<>(10);
        Integer subtract = a.getNumber() - b.getNumber();
        Assertions.assertEquals(subtract, 0);
    }

    @Test
    void test_Integer_Numbers_product(){
        AnyNumber<Integer> a = new AnyNumber<>(10);
        AnyNumber<Integer> b = new AnyNumber<>(10);
        Integer product = a.getNumber() * b.getNumber();
        Assertions.assertEquals(product, 100);
    }


}