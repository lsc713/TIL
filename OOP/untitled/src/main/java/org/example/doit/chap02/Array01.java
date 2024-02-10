package org.example.doit.chap02;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Array01 {

    String color;
    boolean power;
    int channel;
    public static void main(String[] args) {

        int[] a = {1, 2, 3, 4, 5};
        int max = a[0];
        for (int i = 0; i < a.length; i++) {
            if (a[i] > max) {
                max = a[i];
            }
        }
        System.out.println(max);

    }

    @Override
    public String toString() {
        return "Array01{" +
                "color='" + color + '\'' +
                ", power=" + power +
                ", channel=" + channel +
                '}';
    }
}

class Array02 {



    static int maxheight(int[] num){
        int max = num[0];
        for (int i = 1; i < num.length; i++) {
            if (num[i] > max) {
                max = num[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Random rand = new Random();
        Scanner scanner = new Scanner(System.in);
        System.out.println("ㅋㅣ의 최댓값을 구합니다.");
        System.out.print("사람 수 : ");
        int num = rand.nextInt(100);
        System.out.println(num);
        int[] height = new int[num];

        for (int i = 0; i < height.length; i++) {
            System.out.print("height[" + i + "]: ");
            height[i] = 100+rand.nextInt(90);
            System.out.println(height[i]);
        }

        System.out.println("최댓 값은 "+maxheight(height)+"입니다.");
    }
}


class 질문거리 {
    static void swap(int[] a, int idx1, int idx2) {
        int t = a[idx1];
        a[idx1] = a[idx2];
        a[idx2] = t;
    }

    static void reverse(int[] a) {
        for (int i = 0; i < a.length / 2; i++) {
            swap(a,i,a.length-i-1);
        }
    }

    static int sumOf(int[] a) {
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum += a[i];
        }
        return sum;

    }

    static void copy(int[] a, int[] b) {
        for (int i = 0; i < a.length; i++) {
            a[i] = b[i];
        }
    }

    static void rcopy(int[] a, int[] b) {
        for (int i = 0; i < a.length; i++) {
            b[i] = a[a.length - i - 1];
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        System.out.print("요솟수 : ");
        System.out.println();

        int num = rand.nextInt(9) + 1;

        int[] x1 = new int[num];
        int[] x2 = new int[num];

        for (int i = 0; i < x1.length; i++) {
            x1[i] = rand.nextInt(9) + 1;
            System.out.println("x["+i+"] : " +x1[i]);

        }
        for (int i = 0; i < x2.length; i++) {
            x2[i] = rand.nextInt(9) + 1;
            System.out.println("x["+i+"] : " +x2[i]);

        }

//        reverse(x);
//
//        System.out.println("역순 정렬");
//        System.out.println("x = " + Arrays.toString(x));
        System.out.println(Arrays.toString(x1));
        System.out.println(Arrays.toString(x2));
        rcopy(x1, x2);
        System.out.println(Arrays.toString(x2));

        Integer a = 3; // 1. 이건 왜 빨간색인데 실행되지 궂이 쓸필요없는데 써서 경고한듯?
        int b = ++a; //후위형 증가연산자니까 4인걸 알겠음.
        String c = new String("z"); //님 왜 주소 나와야하는거아닌가 참조형 변수니까.. ㅋㅋ
        String d = new String("z"); // 오.. 원래 그냥 주소값안에있는 값이 나오나 보네.
        String[] e = {"a", "b"};

        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c =" +c);
        System.out.println("d =" + d);
        System.out.println("e = " + e); //맞지맞지 주소값나와야지
        System.out.println("e = " + e[0]);
        System.out.println(c == d); //주소값이 다르므로 false
        System.out.println(System.identityHashCode(a));//주소값 반환함수
        System.out.println(System.identityHashCode(b));
        System.out.println(System.identityHashCode(c));
        System.out.println(System.identityHashCode(d));
        System.out.println(c.equals(d)); //그릇안에 값이 같은지 검사 --> 이거 있어보이게 말하는거 어떻게하지

        //Array1 == TV임 잠깐
        Array01 TV = new Array01(); //힙영역에서 인스턴스변수로 만들어진거고 위에는 클래스영역인가?
        System.out.println("TV = " + TV); //이거지 주솟값 나와야하는데 위엔 안나오네.
    }
}


