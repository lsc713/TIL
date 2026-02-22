import java.util.*;

public class Main {
    static int[] dx ={-1,1,0,0};
    static int[] dy = {0,0,-1,1};
    static int n,ans;
    static int[][] grid;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         n = sc.nextInt();
         ans=0;
         grid = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                grid[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                 bfs(i,j);
            }
        }
        System.out.println(ans);
        // Please write your code here.
    }
    static void bfs(int x,int y){
        Queue<int[]> q = new LinkedList<>();
        boolean[][] visited = new boolean[n][n];
        q.add(new int[]{x,y,1});
        visited[x][y]=true;
        while(!q.isEmpty()){
            int[] cur = q.poll();
            int cx = cur[0];
            int cy = cur[1];
            int cnt = cur[2];
            for(int d=0;d<4;d++){
                int nx= cx + dx[d];
                int ny = cy + dy[d];
                if(!in(nx,ny))continue;
                if(visited[nx][ny])continue;
                if(grid[nx][ny]<=grid[cx][cy])continue;
                int ncnt=cnt+1;
                visited[nx][ny]=true;
                q.add(new int[]{nx,ny,ncnt});
                ans=Math.max(ncnt,ans);
            }
        }
    }
    static boolean in(int x,int y){
        return 0<=x&&x<n&&0<=y&&y<n;
    }
}