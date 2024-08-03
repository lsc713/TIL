import java.util.*;
class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        String[] strArr = {"aya", "ye", "woo", "ma"};
        for(int i = 0 ; i<babbling.length;i++){
            for(String val : strArr){
                babbling[i]=babbling[i].replace(val,"1");
            }
        }
        
        for(int i = 0 ; i <babbling.length;i++){
            babbling[i]=babbling[i].replace("1","");
            if(babbling[i].equals("")){
                answer++;
            }
        }
        
        return answer;
    }
}