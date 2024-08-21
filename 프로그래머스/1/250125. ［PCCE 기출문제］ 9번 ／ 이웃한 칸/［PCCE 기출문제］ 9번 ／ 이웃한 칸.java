class Solution {
    
    public int solution(String[][] board, int h, int w) {
        int answer = 0;
        int[] dx = {0,0,1,-1};
        int[] dy = {1,-1,0,0};
        
                for(int k=0;k<4;k++){
                    int nx=h+dx[k];
                    int ny=w+dy[k];
                    if((0<=nx&&nx<board.length&&0<=ny&&ny<board[0].length)){
                        if(board[h+dx[k]][w+dy[k]].equals(board[h][w])){
                        answer++;
                    }
                    }
                }
        return answer;
    }
}