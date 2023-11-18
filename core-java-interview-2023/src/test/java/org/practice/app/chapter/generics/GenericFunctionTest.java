package org.practice.app.chapter.generics;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GenericFunctionTest {
    @Test
    void test_find_Max(){
        int max = GenericFunction.findMax(new Integer[]{10,20,30});
        assertEquals(max, 30);
        String str = GenericFunction.findMax(new String[]{ "apple", "banana", "orange"});
        assertEquals(str, "orange");
    }
}