import java.util.*;
class Solution {
    public int[] solution(int[] numlist, int n) {
        int[] answer = new int[numlist.length];
        double[] tmp = new double[numlist.length];

        for(int i =0;i<numlist.length;i++){
            if(numlist[i]-n<0){
                tmp[i]= ((int) Math.abs(numlist[i]-n))+0.5;
            }else{
                tmp[i] = numlist[i]-n;
            }
        }
        
        Arrays.sort(tmp);
        
        for(int i =0;i<numlist.length;i++){
            if(tmp[i] %1!=0 ){
                answer[i]= n - (int) tmp[i];
            }else{
                answer[i] = n+(int)tmp[i];
            }
        }
        
        return answer;
    }
}