package org.example.doit.chap06;

public class CountingSort {
    static void countingSort(int[] a, int n, int max) {
        int[] f = new int[max + 1];
        int[] b = new int[n];
//도수분포 누적도수분포 목표배열 배열복사 순서
        for (int i = 0; i < n; i++) {
            f[a[i]]++;
        }
        for (int i = 1; i <= max; i++) {
            f[i] += f[i - 1];
        }

        for (int i = n - 1; i >= 0; i--) {
            b[--f[a[i]]] = a[i];
        }
        for (int i = 0; i < n; i++) {
            a[i] = b[i];
        }
    }
}
