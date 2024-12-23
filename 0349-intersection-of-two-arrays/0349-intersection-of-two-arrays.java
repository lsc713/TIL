import java.util.*;
class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet<>();
        Set<Integer> resultSet = new HashSet<>();
        for(int val : nums1){
            set.add(val);
        }
        for(int val : nums2){
            if(set.contains(val)){
                resultSet.add(val);
            }
        }
        int[] result = new int[resultSet.size()];
        int idx =0;
        for(int val : resultSet){
            result[idx++] = val;
        }
        return result;
    }
}