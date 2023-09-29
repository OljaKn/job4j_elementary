package ru.job4j.array;

import java.util.Arrays;

public class Machine {
    public static int[] change(int money, int price) {

        int[] coins = {10, 5, 2, 1};
        int[] rsl = new int[100];
        int size = 0;
        int rem = money - price;
        for (int i = 0; i < coins.length; i++) {
            while (rem >= coins[i]) {
                rem -= coins[i];
                rsl[size] = coins[i];
                size += 1;
            }
        }
        return Arrays.copyOf(rsl, size);
    }
}
