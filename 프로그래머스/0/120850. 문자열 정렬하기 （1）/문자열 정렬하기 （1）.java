import java.util.*;
class Solution {
    public int[] solution(String my_string) {
        int cnt=0;
        char[] c = my_string.toCharArray();
        for(int i=0;i<my_string.length();i++){
            if(Character.isDigit(c[i])){
                cnt++;
            }
        }
        int idx=0;
        int[] answer = new int[cnt];
        
        for(int i=0;i<my_string.length();i++){
            if(Character.isDigit(c[i])){
                int b = Integer.parseInt(String.valueOf(c[i]));
                answer[idx++] = b;
            }
        }
        Arrays.sort(answer);
        return answer;
    }
}