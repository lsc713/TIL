package org.example.doit.chap03;

import java.util.Scanner;

public class Ex2 {
    static int seqSearchSen(int[] a, int n, int key) {
        int i =0;
        a[n]=key;
        while (true) {
            if (a[i] == key) {
                break;
            }
            i++;
        }
        return i==n?-1: i;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("요솟수 : ");
        int num = sc.nextInt();
        int[] x = new int[num];

        for (int i = 0; i < num; i++) {
            x[i] = sc.nextInt();
        }

        int key = sc.nextInt();

        int idx = seqSearchSen(x, num, key);

        if (idx == num) {
            System.out.println("배열에 없음");
        } else {
            System.out.println("그 값은 배열 x의 "+idx+" 번째에 있습니다.");
        }
    }
}
