package org.example.string;

public class Reverse3inary {
    public static class Solution{
        public int solution(int n) {
            String str = Integer.toString(n,3);
            String reversed = new StringBuilder(str).reverse().toString();
            return Integer.valueOf(reversed,3);
        }

        public static void main(String[] args) {
            Solution s = new Solution();
            System.out.println(s.solution(45));
        }
    }
}
