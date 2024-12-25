import java.util.*;
class Solution {
    public String minWindow(String s, String t) {
        if(s==null||t==null||s.length()==0||t.length()==0){
            return "";
        }
        int[] charCount = new int[128];
        for(char c : t.toCharArray()){
            charCount[c]++;
        }
        int left =0;
        int minLen = Integer.MAX_VALUE;
        int minStart =0;
        int count = t.length();

        for(int right = 0; right <s.length();right++){
            if(charCount[s.charAt(right)]-->0){
                count--;
            }
            while(count==0){
                if(right-left+1<minLen){
                    minLen = right-left+1;
                    minStart = left;
                }
                if(++charCount[s.charAt(left)]>0){
                    count++;
                }
                left++;
            }
        }
        return minLen == Integer.MAX_VALUE?"": s.substring(minStart,minStart+minLen);
    }
}