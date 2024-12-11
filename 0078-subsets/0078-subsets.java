class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> answer = new ArrayList<>();
        backtracking(answer,new ArrayList<>(),nums,0);
        return answer;
    }
    void backtracking(List<List<Integer>> answer,List<Integer> result,int[] nums,int at){
        answer.add(new ArrayList<>(result));
        for(int i = at ; i<nums.length;i++){
            result.add(nums[i]);
            backtracking(answer,result,nums,i+1);
            result.remove(result.size()-1);
        }
    }
}