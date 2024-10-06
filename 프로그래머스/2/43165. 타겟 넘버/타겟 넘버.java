class Solution {
    static int answer;
    public int solution(int[] numbers, int target) {
         answer = 0;
        recur(0,numbers,target,0);
        
        return answer;
    }
    static void recur(int depth,int[] numbers,int target, int sum){
        if(depth==numbers.length){
            if(sum==target){
                answer++;
            }
            return;
        }
        recur(depth+1,numbers,target,sum+numbers[depth]);
        recur(depth+1,numbers,target,sum-numbers[depth]);
    }
}