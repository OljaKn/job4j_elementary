package ru.job4j.array;

public class TwoNumberSum {
        public static int[] getIndexes(int[] array, int target) {
            int[] rsl = new int[2];
            for (int i = 0; i < array.length; i++) {
                    for (int j = i + 1; j < array.length; j++) {
                        if (array[i] + array[j] == target) {
                            rsl[0] = i;
                            rsl[1] = j;
                            break;
                        }
                    }
            }
            return rsl;
        }
}
