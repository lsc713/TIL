package org.example.doit.chap05;

import java.util.Scanner;

public class GreatestCommonDivisor {
    class EuclidGCD {
        static int gcd(int x, int y) {
            if (y == 0) {
                return x;
            } else {
                return gcd(y, x % y);
            }
        }

        static int gcd1(int x, int y) {
            while (y != 0) {
                int temp = y;
                y = x%y;
                x = temp;
            }
            return x;
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.println("두 정수의 최대공약수를 구합니다.");
            int x = sc.nextInt();
            int y = sc.nextInt();

            System.out.println("최대 공약수는 " + gcd(x,y)+"입니다.");
        }
    }


}
