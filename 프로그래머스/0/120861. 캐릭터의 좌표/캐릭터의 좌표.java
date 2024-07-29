class Solution {
    public int[] solution(String[] keyinput, int[] board) {
        int[] answer = new int[2];
        String[] direction = {"left", "right", "up", "down"};
        //[ -1,0 ][ 1,0 ][ 0,1 ][ 0,-1 ]
        
        int sx = 0;
        int sy = 0;
        
        for(int i = 0 ; i<keyinput.length;i++){
            for(int j=0;j<4;j++){
                if(keyinput[i].equals(direction[j])){
                    if(j==0&&sx>((board[0]/2)*(-1))){
                        sx-=1;
                    }else if(j==1&&sx<(board[0]/2)){
                        sx+=1;
                    }else if(j==2&&sy<(board[1]/2)){
                        System.out.println((board[1]/2));
                        sy+=1;
                    }else if(j==3&&sy>((board[1]/2)*(-1))){
                        // System.out.println(sy);
                        // System.out.println((board[1]/2)*(-1));
                        sy-=1;
                    }
                }
            }
        }
        answer[0]=sx;
        answer[1]=sy;
        return answer;
    }
}