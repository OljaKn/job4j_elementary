package ru.job4j.array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;
import static ru.job4j.array.Check.mono;

class CheckTest {

    @Test
    void whenDataMonoByTrueThenTrue() {
        boolean[] data = new boolean[] {true, true, true};
        boolean result = mono(data);
        assertThat(result).isTrue();
    }

    @Test
    void whenDataNotMonoByTrueThenFalse() {
        boolean[] data = new boolean[] {true, false, true};
        boolean result = mono(data);
        assertThat(result).isFalse();
    }

    @Test
    void whenDataMonoByFalseThenTrue() {
        boolean[] data = new boolean[] {false, false, false};
        boolean result = mono(data);
        assertThat(result).isTrue();
    }

    @Test
    void whenDataNotMonoByFalseThenFalse() {
        boolean[] data = new boolean[] {false, true, false};
        boolean result = mono(data);
        assertThat(result).isFalse();
    }
}