import java.util.*;
class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int child=0;
        int cookieIndex=0;
        for(int greed : g){
            while(cookieIndex < s.length && s[cookieIndex]<greed){
                cookieIndex++;
            }
            if(cookieIndex < s.length){
                cookieIndex++;
                child++;
            }
            else break;
        }
        return child;
    }
}