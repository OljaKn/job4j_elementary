package ru.job4j.calculator;

public class Calculator {

    public static void plus(int first, int second) {
        int result = first + second;
        System.out.println(result);
    }

    public static void minus(int first, int second) {
        int result = first - second;
        System.out.println(result);
    }

    public static void main(String[] args) {
        plus(100, 500);
        plus(4, 2);
        plus(3, 5);
        minus(7, 3);
        minus(2, 6);

        int one = 1;
        int two = 2;
        int result = one + two;
        System.out.println(result);
        one = 10;
        two = 11;
        result = one + two;
        System.out.println(result);

        int six = 6;
        int four = 4;
        int five = 5;

        int sixDivTwo = six / two;
        int fiveMinusTwo = five - two;
        int fourTimeTwo = four * two;

        System.out.println(sixDivTwo);
        System.out.println(fiveMinusTwo);
        System.out.println(fourTimeTwo);

        int size = 10;
        size = 100;
        size = size - 5;
        System.out.println(size);
    }
}
