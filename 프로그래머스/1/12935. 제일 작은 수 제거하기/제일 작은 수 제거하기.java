import java.util.*;
class Solution {
    public int[] solution(int[] arr) {
        if(arr.length==1){
            return new int[] {-1};
        }
        
        
        int[] answer = new int[arr.length-1];
        
        int[] newArr = arr.clone();
        Arrays.sort(newArr);
        int temp = newArr[0];
        
        int idx=0;
        for(int i = 0 ; i < arr.length;i++){
            if(temp == arr[i]){
                continue;
            }
            answer[idx++] = arr[i];
        }
        return answer;
    }
}