package com.testing;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

import static org.junit.Assert.*;

public class MyMathTest {

    @Rule
    public Timeout timeout = new Timeout(450);

    @Test
    public void add1() throws Exception {
        assertEquals(4, MyMath.add(1,3));
    }

    @Test
    public void add2() throws Exception {
        assertEquals(5, MyMath.add(4,1));
    }

    @Test
    public void add4() throws Exception {
        assertEquals(7, MyMath.add(4,3));
    }

    @Test
    public void add3() throws Exception {
        System.out.println("Hi!");
        add4();
    }

}