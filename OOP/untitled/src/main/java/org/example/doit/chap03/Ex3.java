package org.example.doit.chap03;

import java.util.Random;
import java.util.Scanner;

import static org.example.doit.chap03.Ex3.SeqSearchSen.seqSearchSen;


public class Ex3 {
    // 선형 검색(보초법)
    class SeqSearchSen {
        //--- 요솟수가 n인 배열 a에서 key와 값이 같은 요소를 보초법으로 선형 검색 ---//
        static int seqSearchSen(int[] a, int n, int key) {
            int i = 0;

            a[n] = key;             // 보초를 추가


            for ( i = 0; a[i] != key; i++) {
            }

            return i == n ? -1 : i;
        }


    }


    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        Random random = new Random();

        int num = random.nextInt(9)+1;
        System.out.print("요솟수 : " + num);
        System.out.println();
//            int num = stdIn.nextInt();
        int[] x = new int[num + 1];                        // 요솟수가 num + 1인 배열

        for (int i = 0; i < num; i++) {
            x[i] = random.nextInt(9)+1;
            System.out.println("x[" + i + "] : " + x[i]+" ");
//                x[i] = stdIn.nextInt();
        }

        int ky = random.nextInt(5)+1;
        System.out.print("검색 값 : " + ky + "  ");                    // 키값을 읽력받음
        System.out.println();
//            int ky = stdIn.nextInt();

        int idx = seqSearchSen(x, num, ky);              // 배열 x에서 값이 ky인 요소를 검색

        System.out.print("|");
        for (int i = 0; i < num; i++) {
            System.out.printf("%3d", x[i]);
        }
        System.out.println();
        System.out.println("---------------------");
        System.out.println();

        if (idx == -1)
            System.out.println("검색 값의 요소가 없습니다.");
        else
            System.out.println("검색 값은 x[" + idx + "]에 있습니다.");
    }
}

// 연습3-2
// 선형검색(검색 과정을 자세히 출력)


class SeqSearchEx {

    //--- 배열 a의 앞쪽 n개의 요소에서 key와 일치하는 요소를 선형검색(보초법)---//
    static int seqSearchEx(int[] a, int n, int key) {
        System.out.print("   |");
        for (int k = 0; k < n; k++)
            System.out.printf("%4d", k);
        System.out.println();

        System.out.print("---+");
        for (int k = 0; k < 4 * n + 2; k++)
            System.out.print("-");
        System.out.println();

        for (int i = 0; i < n; i++) {
            System.out.print("   |");
            System.out.printf(String.format("%%%ds*\n", (i * 4) + 3), "");
            System.out.printf("%3d|", i);
            for (int k = 0; k < n; k++)
                System.out.printf("%4d", a[k]);
            System.out.println("\n   |");
            if (a[i] == key)
                return i;					// 검색 성공
        }
        return -1;						// 검색 실패
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("요솟수 : ");
        int num = stdIn.nextInt();
        int[] x = new int[num];		// 요솟수가 num 인 배열

        for (int i = 0; i < num; i++) {
            System.out.print("x[" + i + "] : ");
            x[i] = stdIn.nextInt();
        }

        System.out.print("검색 값 : ");				// 키값을 입력받음
        int ky = stdIn.nextInt();

        int idx = seqSearchEx(x, num, ky);	// 배열 x에서 값이 ky인 요소를 검색

        if (idx == -1)
            System.out.println("그 값의 요소는 존재하지 않습니다.");
        else
            System.out.println("그 값은 x[" + idx + "]에 있습니다.");
    }
}


