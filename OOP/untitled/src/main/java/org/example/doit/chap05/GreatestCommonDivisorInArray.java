package org.example.doit.chap05;

public class GreatestCommonDivisorInArray {
    static int gcd(int x, int y) {
        while (y != 0) {
            int temp = y;
            y = x%y;
            x = y;
        }
        return x;
    }

    static int gcdArray(int[] a, int start, int no) {
        if (no == 1) {
            return a[start];
        } else if (no == 2) {
            return gcd(a[start], a[start + 1]);
        } else {
            return gcd(a[start], gcdArray(a, start + 1, no - 1));
        }
    }

}
