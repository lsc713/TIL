import java.util.*;
class Solution {
    static int[] dx ={-1,1,0,0};
    static int[] dy = {0,0,1,-1};
    static int r,c;
    static boolean[][] visited;
    public int numIslands(char[][] grid) {
         r = grid.length;
         c = grid[0].length;
        visited = new boolean[r][c];
        for(int i = 0 ;i<r;i++){
            for(int j = 0;j<c;j++){
                if(grid[i][j]=='0'){
                    visited[i][j]=true;
                }
            }
        }
        int answer=0;
        for(int i = 0 ;i<r;i++){
            for(int j = 0;j<c;j++){
                if(grid[i][j]=='1'&&!visited[i][j]){
                    answer++;
                    visited[i][j]=true;
                    dfs(i,j,grid);
                }
            }
        }
        return answer;
    }
    static void dfs(int x,int y,char[][] grid){
        for(int k=0;k<4;k++){
            int nx = x+dx[k];
            int ny = y+dy[k];
            if(0<=nx&&nx<r&&0<=ny&&ny<c&&grid[x][y]=='1'&&!visited[nx][ny]){
                visited[nx][ny]=true;
                dfs(nx,ny,grid);
            }
        }
    }
}