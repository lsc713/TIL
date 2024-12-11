class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> answer = new ArrayList<>();
        combination(0,0,candidates,target,new ArrayList<>(),answer);
        return answer;
    }
    void combination(int idx, int at,int[] n,int k,List<Integer> result,List<List<Integer>> answer){
        int temp = 0;
        for(int value : result){
            temp+=value;
        }
        if(temp>k)return;
        if(temp==k){
            answer.add(new ArrayList<>(result));
            return;
        }
        for(int i = at;i<n.length;i++){
            result.add(n[i]);
            combination(idx+1,i,n,k,result,answer);
            result.remove(result.size()-1);
        }
    }
}