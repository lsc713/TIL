package org.example.doit.chap06;

public class SelectionSort {
    static void swap(int[] a, int idx1, int idx2) {
        int t = idx1;
        idx1 = idx2;
        idx2 = t;

    }

    static void selectionSort(int[] a, int n) {
        for (int i = 0; i < n - 1; i++) {
            int min = i;
            for (int j = i + 1; j < n; j++) {
                if (a[j] < min) {
                    min = j;
                }
            }
            swap(a, i, min);
        }
    }
}
