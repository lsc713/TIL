package org.HH99;

public class Main12 {
    public int solution(int num) {
        int answer = 0;
        int don = 1000;
        don -= num;
        while (!(don == 0)) {
            if (don - 500 >= 0) {
                answer += (don / 500);
                don %= 500;
            }
            if (don - 100 >= 0) {
                answer += (don / 100);
                don %= 100;
            }
            if (don - 50 >= 0) {
                answer += (don / 50);
                don %= 50;
            } else {
                if (don - 10 < 0) {
                    break;
                } else {
                    answer += (don / 10);
                    don %= 10;
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Main12 method = new Main12();
        int num1 = 950;
        System.out.println(method.solution(num1));
    }
}
