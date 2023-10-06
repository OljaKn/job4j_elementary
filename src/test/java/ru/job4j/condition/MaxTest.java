package ru.job4j.condition;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class MaxTest {

    @Test
    void whenMax10To5Then10() {
        int a = 10;
        int b = 5;
        int result = Max.max(a, b);
        int expected = 10;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax5To14To10Then14() {
        int a = 5;
        int b = 14;
        int c = 10;
        int result = Max.max(a, b, c);
        int expected = 14;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax5To14To10To20Then20() {
        int a = 5;
        int b = 14;
        int c = 10;
        int d = 20;
        int result = Max.max(a, b, c, d);
        int expected = 20;
        assertThat(result).isEqualTo(expected);
    }
}