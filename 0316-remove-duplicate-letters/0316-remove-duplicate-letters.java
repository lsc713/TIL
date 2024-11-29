import java.util.*;
class Solution {
    public String removeDuplicateLetters(String s) {
        Stack<Character> stack = new Stack<>();
        boolean[] used = new boolean[26];
        int[] last = new int[26];
        for(int i=0;i<s.length();i++){
            last[s.charAt(i)-'a']=i;
        }
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(!used[c-'a']){
                while(!stack.isEmpty()&&
                    c<stack.peek()&&
                    last[stack.peek()-'a']>i
                ){
                    used[stack.pop()-'a']=false;
                }
                stack.push(c);
                used[c-'a']=true;
            }
        }

        StringBuilder sb = new StringBuilder();
        for(char c:stack){
            sb.append(c);
        }
        return sb.toString();
    }
}