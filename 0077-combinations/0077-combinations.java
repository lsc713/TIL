class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> answer = new ArrayList<>();
        combination(0,0,n,k,new ArrayList<>(),answer);
        return answer;
    }
    void combination(int idx, int at,int n,int k,List<Integer> result,List<List<Integer>> answer){
        if(idx==k){
            answer.add(new ArrayList<>(result));
            return;
        }
        for(int i = at;i<n;i++){
            result.add(i+1);
            combination(idx+1,i+1,n,k,result,answer);
            result.remove(Integer.valueOf(i+1));
        }
    }
}