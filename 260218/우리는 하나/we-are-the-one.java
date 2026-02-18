import java.util.*;

public class Main {
    static int[] dx = {-1,1,0,0};
    static int[] dy = {0,0,1,-1};
    static int[][] grid;
    static int n,k,u,d,ans;
    static boolean[][] visited;
    static int[][] list;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ans=0;
         n = sc.nextInt();
         k = sc.nextInt();
         u = sc.nextInt();
         d = sc.nextInt();
         grid = new int[n][n];
         int idx =0;
         list = new int[n*n][2];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                grid[i][j] = sc.nextInt();
                list[idx][0]=i;
                list[idx][1]=j;
                idx++;
            }
        }
        comb(0,0,new int[k]);
        
        
        System.out.println(ans);
        // Please write your code here.

    }
    static void comb(int idx,int cnt,int[] tmp){
        if(cnt==k){
            ans=Math.max(ans,bfs(tmp));
            return;
        }
        for(int i=idx;i<n*n;i++){
            tmp[cnt]=i;
            comb(i+1,cnt+1,tmp);
        }
    }
    static int bfs(int[] tmp){
        Queue<int[]> q = new LinkedList<>();
        visited = new boolean[n][n];
        for(int idx : tmp){
            int x = list[idx][0];
            int y = list[idx][1];
            if(!visited[x][y]){
                visited[x][y]=true;
                q.add(new int[]{x,y});
            }
        }
        int count =0;
        while(!q.isEmpty()){
            int[] cur = q.poll();
            count++;
            for(int dir=0;dir<4;dir++){
                int nx = cur[0]+dx[dir];
                int ny = cur[1]+dy[dir];
                if(!in(nx,ny))continue;
                if(visited[nx][ny])continue;
                int diff = Math.abs(grid[nx][ny]-grid[cur[0]][cur[1]]);
                if(diff>=u&&diff<=d){
                    visited[nx][ny]=true;
                    q.add(new int[]{nx,ny});
                }
                
            }
        }
        return count;
    }
    static boolean in(int nx,int ny){
        return 0<=nx&&nx<n&&0<=ny&&ny<n;
    }
}