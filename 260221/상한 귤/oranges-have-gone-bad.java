import java.util.*;

public class Main {
    static int[] dx = {-1,1,0,0};
    static int[] dy = {0,0,1,-1};
    static int n,k;
    static int[][] grid,ans;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         n = sc.nextInt();
         k = sc.nextInt();
         grid = new int[n][n];
         ans = new int[n][n];
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                grid[i][j] = sc.nextInt();
                ans[i][j]=-1;
                if(grid[i][j]==2){
                    ans[i][j]=0;
                }
            }
        }
        bfs();
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                if(grid[i][j]==1){
                    System.out.print(-2+" ");
                }else{
                    System.out.print(ans[i][j]+" ");
                }
                
            }
            System.out.println();
        }
    }
    static boolean in(int x,int y){
        return 0<=x&&x<n&&0<=y&&y<n;
    }
    static void bfs(){
        Queue<int[]> q = new LinkedList<>();
        boolean[][] visited = new boolean[n][n];
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                if(grid[i][j]==2){
                    q.add(new int[]{i,j});
                    visited[i][j]=true;
                }
            }
        }
        while(!q.isEmpty()){
            int[] cur = q.poll();
            int x = cur[0];
            int y = cur[1];
            for(int d=0;d<4;d++){
                int nx = x+dx[d];
                int ny = y+dy[d];
                if(!in(nx,ny))continue;
                if(visited[nx][ny])continue;
                if(grid[nx][ny]==0)continue;
                grid[nx][ny]=2;
                ans[nx][ny]=ans[x][y]+1;
                visited[nx][ny]=true;
                q.add(new int[]{nx,ny});
            }
        }
    }
}