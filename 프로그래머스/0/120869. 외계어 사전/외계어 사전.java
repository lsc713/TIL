import java.util.*;
class Solution {
    public int solution(String[] spell, String[] dic) {
        int answer = 0;
        Arrays.sort(spell);
        String str = String.join("",spell);
        for(String word : dic){
            char[] c = word.toCharArray();
            Arrays.sort(c);
            String str1 = new String(c);
            
            if(str.equals(str1)){
                return 1;
            }
        }
        return 2;
    }
}