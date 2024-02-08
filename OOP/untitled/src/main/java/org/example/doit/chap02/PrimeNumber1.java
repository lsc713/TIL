package org.example.doit.chap02;

public class PrimeNumber1 {
    public static void main(String[] args) {
        long counter = 0;

        for (int n = 2; n <= 1000; n++) {
            int i = 0;
            for (i = 2; i < n; i++) {
                counter++;
                if (n % i == 0) {
                    break;
                }
            }
            if (n == i) {
                System.out.println(n);
            }
        }
        System.out.println("나눗셈 진행횟수 : " + counter);

    }
}
