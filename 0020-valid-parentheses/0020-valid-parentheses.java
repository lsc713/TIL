import java.util.*;
class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        for(char c : s.toCharArray()){
            if(c=='('||c=='['||c=='{'){
                st.push(c);
            }else if(st.isEmpty()){
                return false;
            }else{
                char item = st.pop();
                if((c==')'&&item!='(')||
                (c==']'&&item!='[')||
                (c=='}'&&item!='{')){
                    return false;
                }
            }
        }
        return st.isEmpty();
    }
}