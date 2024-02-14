package org.example.Week02;

public class 내적 {

    public int solution(int[] a, int[] b) {
        int answer = 1234567890;
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum+= a[i] * b[i];
        }
        return sum;
    }
}
