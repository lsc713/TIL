import java.util.*;
public class Main {
    static int[] dx = {-1,1,0,0};
    static int[] dy = {0,0,-1,1};
    static int n,m;
    static int[][] a;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         n = sc.nextInt();
         m = sc.nextInt();
         a = new int[n][m];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < m; j++)
                a[i][j] = sc.nextInt();
        // Please write your code here.
        bfs(new int[]{0,0});
        
        System.out.println((a[n-1][m-1]==1) ? -1 : a[n-1][m-1]-1);
    }
    static void bfs(int[] tmp){
        Queue<int[]> q= new LinkedList<>();
        boolean[][] visited = new boolean[n][m];
        q.offer(tmp);
        visited[0][0]=true;
        while(!q.isEmpty()){
            int[] cur = q.poll();
            int x = cur[0];
            int y = cur[1];
            if(x==n-1&&y==m-1)return;
            for(int d=0;d<4;d++){
                int nx = x+dx[d];
                int ny = y+dy[d];
                if(!in(nx,ny))continue;
                if(visited[nx][ny])continue;
                if(a[nx][ny]==0)continue;
                q.offer(new int[]{nx,ny});
                a[nx][ny]=a[x][y]+1;
                visited[nx][ny]=true;
            }
        }
    }
    static boolean in(int x,int y){
        return 0<=x&&x<n&&0<=y&&y<m;
    }
}