import java.util.*;
class Solution {
    public double solution(int[] numbers) {
        // double answer = 0;
        // int count = 0;
        // for (int i = 0; i <= numbers.length-1; i++) {
        //     answer += numbers[i];
        //     count+=1;
        // }
        // return answer/count;
        return Arrays.stream(numbers).average().orElse(0);
    }
}