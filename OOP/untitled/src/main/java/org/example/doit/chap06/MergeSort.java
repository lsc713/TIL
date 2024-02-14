package org.example.doit.chap06;

public class MergeSort {
    static void mergePractice(int[] a, int na, int[] b, int nb, int[] c) {
        int pa = 0;
        int pb = 0;
        int pc = 0;

        while (pa < na && pb < nb) {
            c[pc++] = (a[pa] <= b[pa]) ? a[pa++] : b[pb++];
        }
        while (pa < na) {
            c[pc++] = a[pa++];
        }

        while (pb < nb) {
            c[pc++] = b[pb++];
        }
    }

    static int[] buff;
    static void mergeSort(int[] a, int left, int right) {
        if (left < right) {
            int i;
            int center = (left + right) / 2;
            int p =0;
            int j =0;
            int k = left;

            mergeSort(a, left, center);
            mergeSort(a, center + 1, right);
            for (i = left; i <= center; i++) {
                buff[p++] = a[i];
            }

            while (i<=right && j<p) a[k++] = (buff[j] <= a[i]) ? buff[j++] : a[i++];

            while (j < p) {
                a[k++] = buff[j++];
            }
        }
    }

    static void mergeSort(int[] a, int n) {
        buff = new int[n];
        mergeSort(a, 0, n - 1);
        buff = null;
    }
}
