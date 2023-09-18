package ru.job4j.condition;

public class Max {
    public  static int max(int left, int right) {
        int result = left > right ? left : right;
        return result;
    }

    public static void main(String[] args) {
        int i = Max.max(10, 5);
        System.out.println(i);
        int i1 = Max.max(5, 20);
        System.out.println(i1);
        int i2 = Max.max(5, 5);
        System.out.println(i2);
    }
}
