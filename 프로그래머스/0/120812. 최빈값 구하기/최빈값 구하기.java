import java.util.*;
class Solution {
    public int solution(int[] array) {
        int answer = 0;
        int[] arr = new int[1000];
        for(int i =0;i<array.length;i++){
            arr[array[i]] = arr[array[i]]+1;
        }
        boolean isUnique= true;
        int cnt=0;
        for(int i =0;i<arr.length;i++){
            if(arr[i]>cnt){
                cnt=arr[i];
                answer=i;
                isUnique=true;
            }
            else if(arr[i]==cnt){
                isUnique=false;
            }
        }
        return isUnique ? answer: -1;
    }
}