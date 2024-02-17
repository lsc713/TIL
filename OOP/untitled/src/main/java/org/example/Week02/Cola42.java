package org.example.Week02;

public class Cola42 {
    static class Solution {
        public int solution(int a, int b, int n) {
            int answer = 0;
            while (n>=a) {
                    answer += (n / a)*b;
                    n = (n/a)*b+(n % a);

            }
            return answer;
        }
    }

    public static void main(String[] args) {
        Solution a = new Solution();
        System.out.println(a.solution(2, 1, 20));
    }
}
