package org.example.doit.chap06;

import java.util.Scanner;

public class QuickSort {
    static void swap(int[] a, int idx1, int idx2) {
        int t = a[idx1];
        a[idx1] = a[idx2];
        a[idx2] = t;
    }


    static void quickSort(int[] a, int left, int right) {
        int pl = left;
        int pr = right;
        int x = a[(left + right) / 2];

        do {
            while (a[pl] < x) pl++;
            while (a[pr] > x) pr--;
            if (pl <= pr) {
                swap(a, pl++, pr--);
            }
        } while (pl <= pr);

        if (left<pr) quickSort(a, left, pr);
        if (pl<right) quickSort(a, pl, right);
    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("quick sort");
        System.out.println("요솟수: ");
        int nx = sc.nextInt();
        int[] x = new int[nx];

        for (int i = 0; i < nx; i++) {
            System.out.println("x[" + i + "]");
            x[i] = sc.nextInt();
        }

        quickSort(x, 0, nx-1);

        System.out.println();
    }
}
