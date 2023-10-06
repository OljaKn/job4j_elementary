package ru.job4j.condition;

public class Max {
    public  static int max(int a, int b) {
        int result = a > b ? a : b;
        return result;
    }

    public  static int max(int a, int b, int c) {
        int result = max(a, b) > c ? max(a, b) : c;
        return result;
    }

    public  static int max(int a, int b, int c, int d) {
        int result = max(a, b, c) > d ? max(a, b, c) : d;
        return result;
    }

    public static void main(String[] args) {
        int i = Max.max(10, 5);
        System.out.println(i);
        int i1 = Max.max(10, 5, 20);
        System.out.println(i1);
        int i2 = Max.max(10, 5, 20, 6);
        System.out.println(i2);
    }
}
