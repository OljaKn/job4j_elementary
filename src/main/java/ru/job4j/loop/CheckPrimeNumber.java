package ru.job4j.loop;

public class CheckPrimeNumber {
    public static boolean check(int number) {
        boolean prime = true;
        for (int i = 2; i <= number - 1; i++) {
            if (number == 2 || number > 3) {
                if (number % i == 0 || number % 3 == 0) {
                    prime = false;
                }
            }
            break;
        }
        if (number == 1) {
            prime = false;
        }
        return prime;
    }
}
