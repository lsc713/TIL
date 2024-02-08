package org.example.doit.chap02;

import java.util.Scanner;

public class CardConv {
    static int cardConv(int a, int b, char[] d) {
        int digit = 0;
        String string = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        do {
            d[digit++] = string.charAt(a % b);
            a /= b;
        } while (a != 0);

        for (int i = 0; i < digit / 2; i++) {
            char t = d[i];
            d[i] = d[digit-i-1];
            d[digit-i-1] = t;

        }

        return digit;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int no;
        int cd;
        int dno;
        char[] cno = new char[32];

        System.out.println("10진수를 변환합니다.");
        do {
            System.out.println("음이아닌정수를 적어주세요");
            no = sc.nextInt();
        } while (no <= 0);

        System.out.println("몇 진수로 변환할까요");
        do {
            cd = sc.nextInt();
        } while (cd < 2 || cd > 36);

        dno = cardConv(no, cd, cno);

        for (int i = 0; i < dno; i++) {
            System.out.print(cd + "| ");
            System.out.printf("%3d", no);
            System.out.printf("%5s", "...");
            System.out.print(cd);
            System.out.println();
            System.out.printf("%15s","------------");
            System.out.println();
        }

        System.out.println(cd+"진수로");
        for (int i = 0; i < dno; i++) {
            System.out.print(cno[i]);
        }
        System.out.print("입니다");


        }
    }
