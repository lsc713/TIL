package org.example.doit.chap03;

import java.util.Scanner;

public class linearSearch {
    static int secSearch(int[] a, int n, int key) {
        int i =0;

//        while (true) {
//            if (i == n) return -1;
//            if (a[i] == key) return i;
//            i++;
//        }

        for (i = 0; i < n; i++) {
            if (a[i] == key) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("요소수 : ");
        int num = sc.nextInt();
        int[] x = new int[num];

        for (int i = 0; i < num; i++) {
            System.out.println("X[" + i + "]");
            x[i] = sc.nextInt();
        }

        System.out.println("검사할 값");
        int key = sc.nextInt();
        int idx = secSearch(x, num, key);

        if (idx == -1) {
            System.out.println("그 값은 존재하지 않습니다.");
        } else {
            System.out.println("그 값은 x["+idx+ "]에 있습니다. ");
        }
    }
}
