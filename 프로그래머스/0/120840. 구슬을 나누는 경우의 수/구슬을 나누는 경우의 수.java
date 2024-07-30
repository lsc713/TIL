class Solution {
    public int solution(int balls, int share) {
        long answer = 1;
        int idx = 1;
        //30 16 
        for(int i =balls;i>=share+1;i--){
            answer*=i;
            answer/=idx;
            
            idx++;
        }
        return (int)answer;
    }
}