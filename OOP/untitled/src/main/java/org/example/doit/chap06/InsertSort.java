package org.example.doit.chap06;

import java.util.Scanner;

public class InsertSort {
    static void swap(int[] a, int idx1, int idx2) {
        int t = idx1;
        idx1 = idx2;
        idx2 = t;

    }

    static void insertionSort(int[] a, int n) {
        for (int i = 1; i < n; i++) {
            int j;
            int temp = a[i];
            for (j = i; j > 0 && a[j - 1] > temp; j--) {
                a[j] = a[j - 1];
            }
            a[j] = temp;
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int nx = sc.nextInt();
        int[] x = new int[nx];

        for (int i = 0; i < nx; i++) {
            System.out.println("x[" + i + "]");
            x[i] = sc.nextInt();
        }

        insertionSort(x, nx);

        System.out.println();
    }

}
