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
public class MyMathdivTest {

    private int a, b, expResult;

    public MyMathdivTest(int a, int b, int expResult) {
        this.a = a;
        this.b = b;
        this.expResult = expResult;
    }

    @Parameterized.Parameters
    public static Collection numbers(){
        return (Arrays.asList(new Object [][] {{8,8,1}, {4,2,2}, {7,4,1}}));
    }

//    @Rule
//    public Timeout timeout = new Timeout(10);

    @Test//(expected = ArithmeticException.class)
    public void div() throws Exception {
        assertEquals(expResult, MyMath.div(a,b));
    }

}