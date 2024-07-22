import java.util.*;
class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int[] answer = new int[2];
        answer[0]=numer1 * denom2 + numer2 * denom1 ;
        answer[1]=denom1*denom2;
        int a = getgcd(answer[0],answer[1]);      
        
        answer[0]=answer[0]/a;
        answer[1]=answer[1]/a;
        return answer;
    }
    
    public int getgcd(int a , int b){
        if(a%b==0){
            return b;
        }
        return getgcd(b,a%b);
    }
}