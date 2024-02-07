package org.example.doit;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("세 정수의 최댓값을 구합니다.");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int maxInt = a;
        if (b > maxInt) {
            maxInt = b;
        }
        if (c > maxInt) {
            maxInt = c;
        }

        System.out.println("최댓값은 = " + maxInt);
    }
}

class Ex2 {

    static int max3(int a, int b, int c) {
        int maxInt = a;
        if (b > maxInt) {
            maxInt = b;
        }
        if (c > maxInt) {
            maxInt = c;
        }

        return maxInt;
    }

    public static void main(String[] args) {

        System.out.println("max3(3,2,2) = " + max3(3,2,2));

    }
}

class Ex3 {

    static int max4(int a, int b, int c, int d) {
        int maxInt = a;
        if (b > maxInt) {
            maxInt = b;
        }
        if (c > maxInt) {
            maxInt = c;
        }
        if (d > maxInt) {
            maxInt = d;
        }

        return maxInt;
    }

    static int min4(int a, int b, int c, int d) {
        int minInt = a;
        if (b < minInt) {
            minInt = b;
        }
        if (c < minInt) {
            minInt = c;
        }
        if (d < minInt) {
            minInt = d;
        }

        return minInt;
    }

    public static void main(String[] args) {

        System.out.println("max4(3,2,2,4) = " + max4(3,2,2,4));
        System.out.println("min4(3,2,2,4) = " + min4(3,1,2,4));

    }
}

class Ex4 {
    static int median3(int a, int b, int c) {
        if (a >= b) {
            if (b >= c) {
                return b;
            } else if (a <= c) {
                return a;
            } else {
                return c;
            }
        } else if (a >= c) {
            return a;
        } else if (b <= c) {
            return b;
        } else {
            return c;
        }
    }

    public static void main(String[] args) {


        System.out.println("max3(3,2,1) = " + median3(3, 2, 1));        // [A] a＞b＞c
        System.out.println("max3(3,2,2) = " + median3(3, 2, 2));        // [B] a＞b＝c
        System.out.println("max3(3,1,2) = " + median3(3, 1, 2));        // [C] a＞c＞b
        System.out.println("max3(3,2,3) = " + median3(3, 2, 3));        // [D] a＝c＞b
        System.out.println("max3(2,1,3) = " + median3(2, 1, 3));        // [E] c＞a＞b
        System.out.println("max3(3,3,2) = " + median3(3, 3, 2));        // [F] a＝b＞c
        System.out.println("max3(3,3,3) = " + median3(3, 3, 3));        // [G] a＝b＝c
        System.out.println("max3(2,2,3) = " + median3(2, 2, 3));        // [H] c＞a＝b
        System.out.println("max3(2,3,1) = " + median3(2, 3, 1));        // [I} b＞a＞c
        System.out.println("max3(2,3,2) = " + median3(2, 3, 2));        // [J] b＞a＝c
        System.out.println("max3(1,3,2) = " + median3(1, 3, 2));        // [K] b＞c＞a
        System.out.println("max3(2,3,3) = " + median3(2, 3, 3));        // [L] b＝c＞a
        System.out.println("max3(1,2,3) = " + median3(1, 2, 3));        // [M] c＞b＞a
    }


}


class Ex5 {


    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//        if (a > 0) {
//            System.out.println("양수");
//        } else if (a < 0) {
//            System.out.println("음수");
//        } else {
//            System.out.println("0");
//        }

        int a = sc.nextInt();
        if (a == 1) {
            System.out.println("A");
        } else if (a == 2) {
            System.out.println("B");
        } else if (a == 3) {
            System.out.println("C");
        }
    }
}

class ex6{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1부터 n까지 더하기");
        int n,w = 0;

        do {
            System.out.print("n의 값은 : ");
            n = sc.nextInt();

        } while (n <= 0);
        do {
            System.out.print("w의 값은 : ");
            w = sc.nextInt();

        } while (w <= 0 || w>n);


//        int i = 1;
        int sum = 0;
//        while (i <= n) {
//            sum += i;
//            i++;
//        }

//        for (int i = 0; i < n ; i++) {
//            System.out.print("*");
//            if (i % w == w - 1) {
//                System.out.println();
//            }
//
//        }if (n % w != 0) {
//            System.out.println();
//        }

        for (int i = 0; i < n / w; i++) {
            System.out.println("*".repeat(w));
        }
        int rest = n%w;
        if (rest != 0) {
            System.out.println("*".repeat(rest));
        }

//        sum = ((1 + n) * (n / 2)) + (n % 2 == 1 ? (n + 1) / 2 : 0);
    }

}

class ex7{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =0;
        System.out.println("10의 자리 양수를 입력해주세요");
        do {
            n = sc.nextInt();

        } while (!(n >= 10 && n < 100));
        System.out.println("변수 값은"+ n +"입니다.");


    }
}

class Prac8 {


    static int sumof(int a, int b) {
        int sum = 0;
        int min;
        int max;
//        if (b > a) {
//            do {
//                sum += a;
//                a++;
//            } while (a <= b);
//        } else {
//            do {
//                sum += b;
//                b++;
//            } while (b <= a);
//        }
//        return sum;
        if (a > b) {
            min = b;
            max = a;
        } else {
            min = a;
            max = b;
        }
        for (int i = min; i <= max; i++) {
            sum += i;
        }
        return sum;
}

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(
                sumof(a, b)

        );
    }
}