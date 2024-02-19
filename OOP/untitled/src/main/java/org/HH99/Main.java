package org.HH99;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class Main {
    public String solution(String s) {
        String answer = "";
        String[] a = s.split(" ");
        long[] b = new long[a.length];
        long max = Long.MIN_VALUE;
        long min = Long.MAX_VALUE;


        for (int i = 0; i < a.length; i++) {
            b[i] = Long.parseLong(a[i]);
            boolean isPrime = true;
            for (int j = 2; j <= (int) Math.sqrt(b[i]); j++) {
                if (b[i] % j == 0) {
                    isPrime =false;
                    break;
                }
            }
            if (isPrime) {
                max = Math.max(max, b[i]);
            } else {
                min = Math.min(min, b[i]);
            }
        }

//        System.out.println(Arrays.toString(b));
//        System.out.println(max); //최대소수값
//        System.out.println(min); //최대소수값

        String max1 = Long.toString(max);
        String min1 = Long.toString(min);

        answer = min1 + " " + max1;
        return answer;
    }

    public static void main(String[] args) {
        Main method = new Main();
        String s = "5 1";
        System.out.println(method.solution(s));
    }
}
