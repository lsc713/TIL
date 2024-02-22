package org.example.array;

import java.util.Arrays;

public class ReverseArray {
    public static class Solution{
        public int[] solution(long n){
            String str = Long.toString(n);
            String reversed = new StringBuilder(str).reverse().toString();
            char[] c = reversed.toCharArray();

            int[] result = new int[c.length];
            for (int i = 0; i < result.length; i++) {
                result[i] = Character.getNumericValue(c[i]);
            }
            return result;
        }
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        int[] result = s.solution(1234);
        System.out.println(Arrays.toString(result));
        System.out.println('Z'-'A'+1);
    }
}
