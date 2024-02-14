package org.example.Week02;

public class reverse3_30 {
    public int solution(int n) {
        int answer = 0;
        String s = "";
        while (n != 0) {
            s +=n%3;
            n /= 3;
        }
        return Integer.parseInt(s, 3);
    }
}
