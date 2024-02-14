package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    public class Point {
        private int x;
        private int y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    @Test
    void equals() {
        Point point = new Point(2, 3);
        Point point2 = new Point(2, 3);

        // point != point2
        System.out.println(point==point2);
        System.out.println(point.equals(point2));
        System.out.println(point);
        System.out.println(point2);
    }

}