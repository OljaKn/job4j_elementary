package ru.job4j.ru.job4j.condition;

public class Point {
        public static double distance(int x1, int y1, int x2, int y2) {
            double first = x2 - x1;
            double second = y2 - y1;
            double pow1 = Math.pow(first, 2);
            double pow2 = Math.pow(second, 2);
            double sum = pow1 + pow2;
            double rsl = Math.sqrt(sum);
            return rsl;
        }

        public static void main(String[] args) {
            double result = Point.distance(1, 2, 3, 4);
            System.out.println("result (1, 2) to (3, 4) " + result);
        }
}
