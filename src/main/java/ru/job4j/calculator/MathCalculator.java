package ru.job4j.calculator;

import static ru.job4j.math.MathFunction.*;
public class MathCalculator {
    public static double sumAndMultiply(double first, double second) {
        return sum(first, second)
                + multiply(first, second);
    }

    public static double minusAndDivided(double first, double second) {
        return minus(first, second)
                + divided(first, second);
    }

    public static double sumAll(double first, double second) {
        return sum(first, second) + minus(first, second)
                + divided(first, second) + multiply(first, second);
    }

    public static void main(String[] args) {
        System.out.println("Результат расчета равен: " + sumAndMultiply(20, 10));
        System.out.println("Результат расчета равен: " + minusAndDivided(20, 10));
        System.out.println("Сумма всех 4х операций равна: " + sumAll(20, 10));
    }
}
