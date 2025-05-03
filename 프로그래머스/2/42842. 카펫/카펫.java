class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        int sum = brown+yellow;
        for(int row = 1;row<=sum;row++){
            if(sum%row==0){
                int col = sum/row;
                if((row-2)*(col-2)==yellow){
                    answer[0]=col;
                    answer[1]=row;
                    return answer;
                }
            }
            
        }
        return answer;
    }
}