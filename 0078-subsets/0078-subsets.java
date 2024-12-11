class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> answer = new ArrayList<>();
        
        solve(answer,nums,0,0,new ArrayList<>());
        return answer;
    }
    void solve(List<List<Integer>> answer,int[] nums,int idx,int at,List<Integer> curr){
        answer.add(new ArrayList<>(curr));
        for(int i = at ; i <nums.length;i++){
            curr.add(nums[i]);
            solve(answer,nums,idx+1,i+1,curr);
            curr.remove(curr.size()-1);
        }
    }

}