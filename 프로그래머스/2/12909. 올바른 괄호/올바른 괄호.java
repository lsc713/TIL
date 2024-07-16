import java.util.*;
class Solution {
    boolean solution(String s) {
        boolean answer = true;
        int count = 0;
        
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(') {
                count++;
            } else if (c == ')') {
                count--;
                if (count < 0) {
                    return false; // More closing than opening at some point
                }
            }
        }
        
        // If count is zero, parentheses are balanced
        return count==0;
    }
}