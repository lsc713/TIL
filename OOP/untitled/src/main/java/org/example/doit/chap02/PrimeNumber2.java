package org.example.doit.chap02;

public class PrimeNumber2 {
    public static void main(String[] args) {
        int counter = 0;
        int ptr = 0;
        int[] prime = new int[500];

        prime[ptr++] =2;
        for (int i = 3; i <= 1000; i+=2) {
            int j;
            for (j = 1; j < ptr; j++) {
                counter++;
                if (i % prime[j] == 0) {
                    break;
                }
            }
            if (ptr == j) {
                prime[ptr++] = i;
            }

            for (int k = 0; k < ptr; k++) {
                System.out.println(prime[k]);
            }
            System.out.println(counter);
        }
    }
}
