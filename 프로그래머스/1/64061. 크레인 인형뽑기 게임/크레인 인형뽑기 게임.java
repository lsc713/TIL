import java.util.*;

class Solution {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        int[][] arr  = new int[board[0].length][board.length];
        for(int j = 0 ; j<board[0].length;j++){
            for(int i = 0 ; i <board.length;i++){
                arr[j][i]=board[i][j];
            }
        }
        
        Stack<Integer> stack = new Stack<>();
        for(int i=moves.length-1;i>=0;i--){
            stack.push(moves[i]);
        }
        Stack<Integer> result = new Stack<>();
        
        while(!stack.isEmpty()){
            int temp =stack.pop()-1;
            out: for(int i = 0 ; i < arr[0].length;i++){
                if(arr[temp][i] != 0){
                    if(!result.isEmpty() && result.peek() == arr[temp][i]){
                        answer+=2;
                        result.pop();
                        arr[temp][i] = 0;
                        break;
                    }else{
                        result.push(arr[temp][i]);
                    }
                    arr[temp][i] = 0;
                    break;
                    
                    
                } //0 4 2 4 0 1 0 3
            }
        }
        return answer;
    }
}