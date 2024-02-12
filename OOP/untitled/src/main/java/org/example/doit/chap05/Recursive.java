package org.example.doit.chap05;

import java.util.Scanner;


//public class Recursive {
//
//    class Recur {
//        static void recur(int n) {
//            if (n > 0) {
//                recur(n - 1);
//                System.out.println(n);
//                recur(n - 2);
//            }
//        }
//
//
//        static void recur2(int n) {
//            if (n > 0) {
//                recur2(n - 2);
//                System.out.println(n);
//                recur2(n - 1);
//            }
//        }
//
//        static void recur3(int n) {
//            while (n > 0) {
//                recur3(n - 1);
//                System.out.println(n);
//                n = n - 2;
//            }
//        }
//
//        public static void main(String[] args) {
//            Scanner sc = new Scanner(System.in);
//            System.out.println("decimal input");
//            int x = sc.nextInt();
//
//            recur(x);
//        }
//
//
//    }

    public class Recursive {
        static String[] memo;

        static void recur(int n) {
            if (memo[n + 1] != null) {
                System.out.print(memo[n + 1]);
            } else {
                if (n > 0) {
                    recur(n - 1);
                    System.out.println(n);
                    recur(n - 2);
                    memo[n + 1] = memo[n] + n + "\n" + memo[n - 1];
                } else {
                    memo[n + 1] = "";
                }
            }
        }

        public static void main(String[] args) {



            Scanner sc = new Scanner(System.in);
            System.out.print("decimal input ");
            int x = sc.nextInt();

            memo = new String[x + 2];
            recur(x);

        }
    }
