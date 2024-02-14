package org.example.Week02;

import java.util.Arrays;

public class Solution2 {

    class Solution {
        public boolean solution(int x) {
            boolean answer = true;

            String s = String.valueOf(x);
            String[] arr = s.split("");

            int sum =0;
            for (String string : arr) {
                sum += Integer.parseInt(string);
            }

            if (x % sum == 0) {
                answer = true;
            } else {
                answer = false;
            }

            return answer;
        }
    }
}
