package org.example.doit;

import java.util.Scanner;

public class PracticeJava {
    public static void main(String[] args) {
        for (int i = 1; i <= 9; i++) {
            System.out.printf("%3d", i);
        }
        System.out.println();
        System.out.println("=====================================");
        for (int i = 1; i <= 9; i++) {
            System.out.printf("%d",i);
            System.out.print(" |");
            for (int j = 1; j <= 9; j++) {
                System.out.printf("%3d", i + j);
            }
            System.out.println();

        }
    }
}

class PracticeJava2{

    static void triangleLB(int n) {

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j < n-i; j++) {
                System.out.print(' ');
            }
            for (int j = 1; j <= (i-1)*2+1; j++) {
                System.out.print("*");
            }
            System.out.println();

        }

    }
    public static void main(String[] args) {
        PracticeJava2.triangleLB(5);

    }
}
