package com.testing;

class MyMath {

    /**
     * Сумматор передаваемых целочисленных аргументов.
     *
     * <br><br>Возвращает сумму двух аргументов
     *
     *
     * @param a первый целочисленный аргумент
     * @param b второй целочисленный аргумент
     * @return сумма аргументов
     */

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