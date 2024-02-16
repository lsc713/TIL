package org.example.doit.chap07;

import java.util.Scanner;

public class bfMatch {
    static int bfMatch(String txt, String pat) {
        int pt = 0;
        int pp = 0;

        while (pt != txt.length() && pp != pat.length()) {
            if (txt.charAt(pt) == pat.charAt(pp)) {
                pt++;
                pp++;
            } else {
                pt = pt - pp -1;
                pp = 0;
            }
        }
        if (pp == pat.length()) {
            return pt - pp;
        }
        return -1;
    }

    static int bfMatchR(String txt, String pat) {
        int pt = txt.length() - 1;
        int pp = pat.length() - 1;

        while (pt >= 0 && pp >= 0) {
            if (txt.charAt(pt) == pat.charAt(pp)) {
                pt--;
                pp--;
            } else {
                pt = pt + (pat.length() - pp) - 2;
                pp = pat.length() - 1;
            }
        }
        if (pp < 0) {
            return pt + 1;
        }
        return -1;
    }

    static int kmpMatch(String txt, String pat) {
        int pt = 1;
        int pp = 0;
        int[] skip = new int[pat.length() + 1];

        skip[pt] = 0;
        while (pt != pat.length()) {
            if (pat.charAt(pt) == pat.charAt(pp)) {
                skip[++pt] = ++pp;
            } else if (pp == 0) {
                skip[++pt] = pp;
            } else {
                pp = skip[pp];
            }


        }
        pt = pp =0;
        while (pt != txt.length() && pp != pat.length()) {
            if (txt.charAt(pt) == pat.charAt(pp)) {
                pt++;
                pp++;
            } else if (pp == 0) {
                pt++;
            } else {
                pp = skip[pp];
            }
        }
        if (pp == pat.length()) {
            return pt-pp;
        }
        return -1;

    }


    static int bmMatch(String txt, String pat) {
        int pt;
        int pp;
        int txtLen = txt.length();
        int patLen = pat.length();
        int[] skip = new int[(Character.MAX_VALUE + 1)];

        for (pt = 0; pt <= Character.MAX_VALUE; pt++) {
            skip[pt] = patLen;
        }
        for (pt = 0; pt < patLen - 1; pt++) {
            skip[pat.charAt(pt)] = patLen - pt - 1;
        }
        while (pt < txtLen) {
            pp = patLen - 1;
            while (txt.charAt(pt) == pat.charAt(pp)) {
                if (pp == 0) {
                    return pt;
                }
                pp--;
                pt--;
            }
            pt+= (skip[txt.charAt(pt)]>patLen-pp) ? skip[txt.charAt(pt)] : patLen-pp ;
        }
        return -1;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("text: ");
        String s1 = sc.next();

        System.out.println("pattern: ");
        String s2 = sc.next();

        int idx = bfMatch(s1, s2);

        if (idx == -1) {
            System.out.println("pattern in text not existed");
        } else {
            int len = 0;
            for (int i = 0; i < idx; i++) {
                len += s1.substring(i, i + 1).getBytes().length;
            }
            len += s2.length();
            System.out.println((idx + 1) + "번재 문자부터 일치합니다.");
            System.out.println("text : " + s1);
            System.out.printf(String.format("pattern : %%%ds\n", len), s2);
        }
    }
}
