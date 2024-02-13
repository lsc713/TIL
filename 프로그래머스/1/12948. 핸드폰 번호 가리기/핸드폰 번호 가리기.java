import java.util.*;
import java.util.stream.Collectors;
class Solution {
    public String solution(String phone_number) {
        String answer = "";
        String[] arr = phone_number.split("");
        for (int i = 0; i < arr.length-4; i++) {
            arr[i] = "*";
        }
        answer = Arrays.stream(arr).collect(Collectors.joining());

        return answer;
    }
}