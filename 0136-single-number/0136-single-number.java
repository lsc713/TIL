import java.util.*;
class Solution {
    public int singleNumber(int[] nums) {
        // int result =0;
        // for(int val :nums){
        //     result^=val;
        // }
        // return result;
        Map<Integer,Integer> map= new HashMap<>();
        for(int val : nums){
            map.put(val,map.getOrDefault(val,0)+1);
        }
        for(int val : map.keySet()){
            if(map.get(val)==1){
                return val;
            }
        }
        return -1;
    }
}