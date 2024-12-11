import java.util.*;
class Solution {
    List<List<Integer>> answer;
    
    public List<List<Integer>> permute(int[] nums) {
        answer = new ArrayList<>();
        List<Integer> result = new ArrayList<>();
        perm(0,result,nums);
        return answer;
    }
    void perm(int idx, List<Integer> result,int[] nums){
        if(idx == nums.length){
            answer.add(new ArrayList<>(result));
            return;
        }
        for(int i = 0 ; i <nums.length;i++){
                if(result.contains(nums[i]))continue;
                result.add(nums[i]);
                perm(idx+1,result,nums);
                result.remove(Integer.valueOf(nums[i]));
            
        }
        
    }
}