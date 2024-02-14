package org.example.Week02;

import java.util.*;
import java.util.stream.Collectors;

public class Solution {
    public int[] solution(int[] arr, int divisor) {
        int[] answer = new int[arr.length];
        int i = 0;

        List<Integer> arr1 = new ArrayList<>();
        Arrays.sort(arr);

        for (int num : arr) {
            if (num % divisor == 0) {
                arr1.add(num);
            }
        }

        for (int j = 0; j < arr1.size(); j++) {
            answer[i] = arr1.get(i);
        }
        return answer;
    }


    public static void main(String[] args) {
        int[] arr = {5, 8, 7, 10};
        Solution s = new Solution();
        s.solution(arr, 5);
        System.out.println(Arrays.toString(s.solution(arr,5)));
    }
}

