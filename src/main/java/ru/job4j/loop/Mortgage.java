package ru.job4j.loop;

public class Mortgage {
    public static int year(double amount, int salary, double percent) {
        amount = amount + amount * (percent / 100);
        int year = 0;
        while (amount > 0) {
            double b = amount - salary;
            amount = (b * percent / 100) + b;
            year++;
        }
        return year;
    }

    public static void main(String[] args) {
        int f = Mortgage.year(10000, 1500, 10);
        System.out.println(f);
    }
}

