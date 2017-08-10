package com.testing;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class MyMathaddTest {

    private int a, b, expResult;

    public MyMathaddTest(int a, int b, int expResult) {
        this.a = a;
        this.b = b;
        this.expResult = expResult;
    }

    @Parameterized.Parameters
    public static Collection numbers(){
        return (Arrays.asList(new Object [][] {{1,2,3}, {6,2,8}, {7,4,11}}));
    }

//    @Rule
//    public Timeout timeout = new Timeout(200);

    @Test
    public void add() throws Exception {
        assertEquals(expResult, MyMath.add(a,b));
    }

    @Test
    public void add2() throws Exception {
        System.out.println("Hi!");
        add();
    }

}