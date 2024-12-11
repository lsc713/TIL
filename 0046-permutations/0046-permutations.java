class Solution {
    List<List<Integer>> answer = new ArrayList<>();
    
    boolean[] visited;
    public List<List<Integer>> permute(int[] nums) {
        visited = new boolean[nums.length];
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
            if(!visited[i]){
                visited[i]=true;
                result.add(nums[i]);
                perm(idx+1,result,nums);
                result.remove(Integer.valueOf(nums[i]));
                visited[i]=false;
            }
            
        }
        
    }
}