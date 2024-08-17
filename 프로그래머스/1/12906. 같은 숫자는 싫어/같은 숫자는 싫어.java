import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        
        int cnt=0;
        Stack<Integer> stack = new Stack<>();
        for(int i = 0 ; i<arr.length;i++){
            if(!(stack.isEmpty()) &&stack.peek()==arr[i]){
                continue;
            }else{
                cnt++;
                stack.push(arr[i]);    
            }
                      
        }
        int[] answer = new int[cnt];
        for(int i= answer.length-1;i>=0;i--){
            answer[i]=stack.pop();
        }
        return answer;
    }
}