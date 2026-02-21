import java.util.*;

public class Main {
    static int n,k,ans,r1,c1,c2,r2;
    static boolean in(int x,int y){
        return 0<=x&&x<n&&0<=y&&y<n;
    }
    static int[] dx = {-1,1,0,0};
    static int[] dy = {0,0,-1,1};
    static int[][] grid;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         n = sc.nextInt();
         k = sc.nextInt();
        ans=0;
         grid = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                grid[i][j] = sc.nextInt();
            }
        }
         r1 = sc.nextInt()-1;
         c1 = sc.nextInt()-1;
         r2 = sc.nextInt()-1;
         c2 = sc.nextInt()-1;
                
        System.out.println(bfs(r1,c1));
    }
    static int bfs(int x,int y){
        Queue<int[]> q= new LinkedList<>();
        boolean[][][] visited = new boolean[n][n][k+1];
        visited[x][y][k]=true;
        q.add(new int[]{x,y,k});
        while(!q.isEmpty()){
            int size = q.size();
            for(int i = 0 ; i < size;i++){
                int[] cur = q.poll();
                int cx = cur[0];
                int cy = cur[1];
                int wallchance = cur[2];
                if(cx==r2&&cy==c2) return ans;
                for(int d=0;d<4;d++){
                    int nx = cx+dx[d];
                    int ny = cy+dy[d];
                    int newwallchance = wallchance;
                    if(!in(nx,ny))continue;
                    if(visited[nx][ny][newwallchance])continue;
                    if(grid[nx][ny]==1&&wallchance<=0)continue;
                    if(grid[nx][ny]==1){
                        newwallchance--;
                    }
                    visited[nx][ny][newwallchance]=true;
                    q.add(new int[]{nx,ny,newwallchance});
                }
            }
            ans++;
        }
        return -1;
    }
}