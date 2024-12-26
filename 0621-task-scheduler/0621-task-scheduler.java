import java.util.*;
class Solution {
    public int leastInterval(char[] tasks, int n) {
        int[] frequency = new int[26];
        for(char c : tasks){
            frequency[c-'A']++;
        }
        int maxFreq = 0;
        for(int val : frequency){
            maxFreq = Math.max(val,maxFreq);
        }
        int maxCount =0;
        for(int val : frequency){
            if(val == maxFreq){
                maxCount++;
            }
        }
        return Math.max((maxFreq-1)*(n+1)+maxCount,tasks.length);
    }
}