import java.util.*;
class Solution {
    public int lengthOfLongestSubstring(String s) {
        Map<Character,Integer> map = new HashMap<>();
        int maxLength=0;
        int windowStart=0;
        for(int windowEnd = 0;windowEnd<s.length();windowEnd++){
            char curr = s.charAt(windowEnd);
            if(map.containsKey(curr)){
                windowStart = Math.max(windowStart,map.get(curr)+1);
            }
            map.put(curr,windowEnd);
            maxLength=Math.max(maxLength,windowEnd-windowStart+1);
        }
        return maxLength;        
    }
}