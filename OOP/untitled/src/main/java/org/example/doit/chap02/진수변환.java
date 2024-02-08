package org.example.doit.chap02;

import java.util.Scanner;

public class 진수변환 {
    static int cardConv(int x, int r, char[] d) {//나눌값, 나눌 진법수, 반환값
        int digits =0;
        String dchar = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        do {
            d[digits++] = dchar.charAt(x % r);
            x /= r;
        } while (x != 0);

        for (int i = 0; i < digits / 2; i++) {
            char t = d[i];
            d[i] = d[digits - i - 1];
            d[digits - i - 1] = t;
        }
        return digits;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int no;
        int cd;
        int dno;
        char[] cno = new char[32];

        System.out.println("10진수를 기수로 변환합니다.");
            do {
                System.out.println("음이 아닌 정수 입력: ");
                no = sc.nextInt();
            } while (no <= 0);
            do {
                System.out.println("어떤 진수로 변환할까요");
                cd = sc.nextInt();
            } while (cd < 2 || cd > 36);
            dno = cardConv(no, cd, cno);

            System.out.println(cd + "진수로");
            for (int i = 0; i < dno; i++) {
                System.out.println(cno[i]);
            }
        }
    }
    //===================================================================//

