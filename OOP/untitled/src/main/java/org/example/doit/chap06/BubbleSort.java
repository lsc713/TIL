package org.example.doit.chap06;

import java.util.Scanner;

public class BubbleSort {
    static void swap(int[] a, int idx1, int idx2) {
        int t = a[idx1];
        a[idx1] = a[idx2];
        a[idx2] = t;
    }


    static void shellSort(int[] a, int n) {
        for (int h = n / 2; h > 0; h /= 2) {
            for (int i = h; i < n; i++) {
                int j;
                int tmp = a[i];
                for (j = i - h; j >= 0 && a[j] > tmp; j -= h) {
                    a[j + h] = a[j];
                }
                a[j+h] = tmp;
            }
        }
    }

    static void shellSort2(int[] a, int n) {
        int h;
        for ( h = 1; h < n; h= h*3+1)
            ;
        for (; h > 0; h /= 3) {
            for (int i = h; i < n; i++) {
                int j;
                int tmp = a[i];
                for (j = i - h; j >= 0 && a[j] > tmp; j -= h) {
                    a[j + h] = a[j];
                }
                a[j + h] = tmp;
            }
        }
    }

    static void ShakerSort(int[] a, int n) {
        int left = 0;
        int right = n-1;
        int last = right;

        while (left < right) {
            for (int j = right; j < left; j--) {
                if (a[j - 1] > a[j]) {
                    swap(a, j, j - 1);
                    last = j;
                }
            }
            left = last;
            for (int j = left; j < right; j++) {
                if (a[j] > a[j+1]) {
                    swap(a, j, j + 1);
                    last = j;
                }
            }
            right = last;
        }
    }


    static void bubbleSort(int[] a, int n) {
        for (int i = 0; i < n - 1; i++) {
            int exchg =0;
            for (int j = n - 1; j < i; j--) {
                if (a[j - 1] > a[j]) {
                    swap(a, j - 1, j);
                    exchg++;
                }
            }
            if (exchg == 0) {
                break;
            }
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

        bubbleSort(x, nx);

        System.out.println();
    }
}
