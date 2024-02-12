package org.example.doit.chap05;

import java.util.Scanner;

public class Factorial {
    static int factorial(int n) {
        if (n > 0) {
            return n * factorial(n - 1);
        } else {
            return 1;
        }
//        return (n>0)? n* factorial(n-1) : 1;
    }

    static int factorial1(int n) {
        int fact = 1;
        while (n > 1) {
            fact *= n--;
        }
        return fact;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("decimal input");
        int x = sc.nextInt();

        System.out.println(x+"factorial is " + factorial(x));
    }
}
