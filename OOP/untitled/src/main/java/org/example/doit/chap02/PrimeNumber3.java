package org.example.doit.chap02;

import java.util.Arrays;

public class PrimeNumber3 {
    public static void main(String[] args) {
        int counter =0;
        int ptr = 0;
        int[] prime = new int[500];

        prime[ptr++] =2;
        prime[ptr++] =3;

        for (int n = 5; n < 1000; n += 2) {
            boolean a = false;
            for (int i = 1; prime[i] * prime[i] <= n; i++) {
                counter +=2;
                if (n % prime[i] == 0) {
                    a = true;
                    break;
                }
            }
            if (!(a)) {
                prime[ptr++] =n;
                counter++;
            }

            for (int i = 0; i < ptr; i++) {
                System.out.println(prime[i]);

            }
            System.out.println(counter);
        }

    }
}

class cloneArray{
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5};
        int[] b = a.clone();

        b[3] = 0;
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
    }

}

class enhancedFor{
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};

        int sum = 0;
        for (int i : a) {
            sum+=i;
        }
        System.out.println(sum);
    }
}