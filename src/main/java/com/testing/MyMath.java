package com.testing;

class MyMath {

    static int add (int a, int b) throws InterruptedException {
        Thread.sleep(100);
        return a+b;
    }

    static int div (int a, int b) {
        return a/b;
    }
}
