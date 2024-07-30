import java.util.*;
class Solution {
    public int solution(int[] array) {
        int answer = -1;
        int k=-1;
        for(int i =0 ;i<array.length;i++){
            if(array[i]>k){
                k=array[i];
            }
        }
        int[] count = new int[k+1];
        for(int i =0 ;i<array.length;i++){
            count[array[i]]++;
        }
        for(int i =0 ;i<count.length;i++){
            answer= Math.max(answer,count[i]);
        }
        System.out.println(answer);
        for(int i =0 ;i<count.length;i++){
            if(answer == count[i]){
                answer=i;
                break;
            }
        }
        System.out.println(answer);
        
        Arrays.sort(count);
        System.out.println(Arrays.toString(count));
        if(count[count.length-1]==count[count.length-2]){
            return -1;
        }
        
        return answer;
    }
}