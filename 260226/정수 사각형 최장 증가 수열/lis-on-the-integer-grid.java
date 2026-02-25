import java.util.Scanner;

public class Main {
    static int n;
    static int[][] grid, dp;
    static int[] dx = {-1,1,0,0};
    static int[] dy = {0,0,-1,1};
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         n = sc.nextInt();
         grid = new int[n][n];
         dp = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                grid[i][j] = sc.nextInt();
            }
        }
        int ans =1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                ans = Math.max(ans,dfs(i,j));
            }
        }
        System.out.println(ans);
        // Please write your code here.
    }
    static boolean in(int x,int y){
        return 0<=x&&x<n&&0<=y&&y<n;
    }
    static int dfs(int x,int y){
        if(dp[x][y]!=0)return dp[x][y];
        dp[x][y]=1;
        for(int d= 0; d<4;d++){
            int nx = x+dx[d];
            int ny = y+dy[d];
            if(!in(nx,ny))continue;
            if(grid[nx][ny]<=grid[x][y])continue;
            dp[x][y] = Math.max(dp[x][y],dfs(nx,ny)+1);
        }
        return dp[x][y];
    }
}