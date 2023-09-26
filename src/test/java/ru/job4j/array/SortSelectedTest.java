package ru.job4j.array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class SortSelectedTest {

    @Test
    public void whenSort() {
        int[] data = new int[] {3, 4, 1, 2, 5};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {1, 2, 3, 4, 5};
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void whenSort3() {
        int[] data = new int[] {7, 10, 1};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {1, 7, 10};
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void whenSort5() {
        int[] data = new int[] {6, 4, 10, 2, 8};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {2, 4, 6, 8, 10};
        assertThat(result).containsExactly(expected);
    }
}