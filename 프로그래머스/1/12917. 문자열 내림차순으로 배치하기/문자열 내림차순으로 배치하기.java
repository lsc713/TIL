import java.util.Arrays;
class Solution {
    public String solution(String s) {
        String answer = "";
        String[] arr = s.split("");
        Arrays.sort(arr);
        
        for (int i = arr.length-1; i >= 0; i--) {
            answer += arr[i];
        }
        return answer;
    }
}