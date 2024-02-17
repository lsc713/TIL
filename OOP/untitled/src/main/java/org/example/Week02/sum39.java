package org.example.Week02;

import java.util.ArrayList;
import java.util.Arrays;

public class sum39 {
    public int[] solution(int[] numbers) {
        ArrayList<Integer> arr = new ArrayList();
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length; j++) {
                if (arr.indexOf(numbers[i] + numbers[j])<0) {
                    arr.add(numbers[i] + numbers[j]);
                }
            }
        }
        int[] answer = new int[arr.size()];

        for (int i = 0; i < arr.size(); i++) {
            answer[i] = arr.get(i);
        }
        Arrays.sort(answer);
        return answer;
    }
}
