package org.example.Week02;

public class GCDLCM29 {
    public int[] solution(int n, int m) {

        int max = Math.max(n, m);
        int min = Math.min(n, m);

        while (min != 0) {
            int s = max % min;
            max = min;
            min = s;
        }
        int lcm = n*m/max;

        int[] answer = {max, lcm};

        return answer;
    }
}
