package ru.job4j.ru.job4j.condition;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.withPrecision;
import static org.junit.jupiter.api.Assertions.*;

class PointTest {

   /* @Test
    void when00to20then2() {
        double expected = 2;
        int x1 = 0;
        int y1 = 0;
        int x2 = 2;
        int y2 = 0;
        double out = Point.distance(x1, y1, x2, y2);
        assertThat(out).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void when01to31then3() {
        double expected = 3;
        int x1 = 0;
        int y1 = 1;
        int x2 = 3;
        int y2 = 1;
        double out = Point.distance(x1, y1, x2, y2);
        assertThat(out).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void when12to52then4() {
        double expected = 4;
        int x1 = 1;
        int y1 = 2;
        int x2 = 5;
        int y2 = 2;
        double out = Point.distance(4);
        assertThat(out).isEqualTo(expected, withPrecision(0.01));
    }
*/
    @Test
    public void when020To041Then2() {
        Point a = new Point(0, 2, 0);
        Point b = new Point(0, 4, 1);
        a.distance(b);
        double expected = 2;
        assertThat(a.distance(b)).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    public void when120To051Then3() {
        Point a = new Point(1, 2, 0);
        Point b = new Point(0, 5, 1);
        a.distance(b);
        double expected = 3.16;
        assertThat(a.distance(b)).isEqualTo(expected, withPrecision(0.01));
    }
}