package org.example.Week02;

public class DeficientMoney {
    public long solution(int price, int money, int count) {
        long answer = -1;
        int result = 0;
        for (int i = 1; i <= count; i++) {
            result += price *i;

        }
        if (result >= money) {
            answer = result - money;
        } else {
            return 0;
        }

        return answer;
    }

    public static void main(String[] args) {
        DeficientMoney sc = new DeficientMoney();


        System.out.println(sc.solution(3, 20, 4));
    }
}
