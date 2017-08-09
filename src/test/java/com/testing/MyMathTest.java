package com.testing;

import org.junit.Test;

import static org.junit.Assert.*;

public class MyMathTest {

    @Test
    public void add1() throws Exception {
        assertEquals(4, MyMath.add(1,3));
    }

    @Test
    public void add2() throws Exception {
        assertEquals(5, MyMath.add(2,3));
    }

    @Test
    public void add3() throws Exception {
        assertEquals(7, MyMath.add(4,3));
    }

}