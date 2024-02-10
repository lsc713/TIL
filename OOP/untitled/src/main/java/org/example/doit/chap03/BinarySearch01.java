package org.example.doit.chap03;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("요솟 수 : ");
        int num = sc.nextInt();
        int[] x = new int[num];

        System.out.print("x[0]");
        x[0] = sc.nextInt();

        for (int i = 0; i < num; i++) {
            do {
                System.out.println("x[" + i + "]: ");
                x[i] = sc.nextInt();
            } while (x[i] < x[i - 1]);
        }

        int key = sc.nextInt();

        int idx = Arrays.binarySearch(x, key);

        if (idx < 0) {
            int idxPoint = -idx-1;
            System.out.println("그 값의 요소가 없습니다.");
            System.out.printf("삽입포인트는 %d 입니다.\n",idxPoint);
        } else {
            System.out.println("그값은 x["+idx+"]에 있습니다.");
        }
    }
}
