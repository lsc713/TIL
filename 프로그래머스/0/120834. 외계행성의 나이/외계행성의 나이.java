import java.util.*;

class Solution {
    public String solution(int age) {
        String answer = "";
        String[] str = {"a","b","c","d","e","f","g","h","i","j"};
        while(age>0){
            answer = str[age%10]+answer;
            age/=10;
            
        }
        return answer;
    }
}