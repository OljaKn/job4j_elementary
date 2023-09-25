package ru.job4j.array;

public class Turn {
  public static int[] back(int[] array) {
      int l = array.length / 2;
        for (int index = 0; index < l; index++) {
                int temp = array[index];
                array[index] = array[array.length - 1 - index];
                array[array.length - 1 - index] = temp;
            }
      return array;
    }
}
