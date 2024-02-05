package org.example.baseball;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

import static java.lang.Math.random;

public class BaseBall {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int  a = (int)(random() *10);
//        int  b = (int)(random() *10);
//        while (a == b){
//            b = (int)(random() *10);
//        }
//        int c = (int) (random() * 10);
//        while (c == a && c == b){
//            c = (int) (random() * 10);
//        }
//        ArrayList<Integer> arr = new ArrayList<>();
//
//        arr.add(a);
//        arr.add(b);
//        arr.add(c);

        int[] arr = new int[3];
        arr[0] = (int) (random() * 10);
        arr[1] = (int) (random() * 10);
        while (arr[0] == arr[1]){
            arr[1] = (int) (random() * 10);
        }
        arr[2] = (int) (random() * 10);
        while (arr[2] == arr[0] || arr[2] == arr[1]) {
            arr[2] = (int) (random() * 10);
        }

        System.out.println("arr = " + Arrays.toString(arr));

        int[] answer = new int[3];
        System.out.println("컴퓨터가 숫자를 생성했습니다. 답을 맞춰보세요");
        int strike = 0;
        int ball = 0;
        int count = 0;
        while (true) {
            count++;

            for (int i = 0; i < answer.length; i++) {
                answer[i] = sc.nextInt();
                if (arr[i] == answer[i]) {
                    strike += 1;
                }
                if (answer[0] == answer[1] || answer[0] == answer[2] || answer[1] == answer[2]) {
                    System.out.println("중복발생");
                    continue;
                }
                for (int j = 0; j < answer.length; j++) {
                    if (arr[j]==answer[i]){
                        ball += 1;
                    }
                }
//
//            if (ball == 0) {
//                System.out.println(strike+"S");
//                strike=0;
//                ball=0;
//
//            } else if (strike == 0) {
//                System.out.println(ball + "B");
//                strike=0;
//                ball=0;
//            } else {
//                System.out.println(ball + "B" + strike + "S");
//                strike=0;
//                ball=0;
//            }

            }
            System.out.println(ball+"B"+strike+"S");




            if (strike == 3) {
                System.out.println(count + "번만에 맞히셨습니다.");
                System.out.println("게임을 종료합니다.");
                break;
            } else {
                strike = 0;
                ball=0;
                continue;
            }
        }
    }
}
