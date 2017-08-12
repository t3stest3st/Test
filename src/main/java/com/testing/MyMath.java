package com.testing;

class MyMath {

    static int add (int a, int b) {
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return a+b;
    }

    static int div (int a, int b) {
        return a/b;
    }
}