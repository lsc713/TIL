import java.util.*;
class Solution {
    public long solution(int n, int[] times) {
        Arrays.sort(times);
        long L = 1;
        long R = (long) times[times.length-1] * n;
        long answer = R;
        
        while(L<=R){
            long mid = (L+R)/2;
            long proceed =0;
            for(int time : times){
                proceed += mid/time;
                if(proceed >= n)break;
            }
            if(proceed >= n){
                answer=Math.min(answer,mid);
                R = mid-1;
            }else {
                L = mid+1;
            }
        }
        return answer;
    }
}