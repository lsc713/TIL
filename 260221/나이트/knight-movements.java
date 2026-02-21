import java.util.*;
public class Main {
    static int[] dx = {-2,-2,2,2,1,-1,-1,1};
    static int[] dy = {-1,1,-1,1,-2,2,-2,2};
    static int n,r1,c1,r2,c2,ans;
    static int[][] grid;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         n = sc.nextInt();
         r1 = sc.nextInt()-1;
         c1 = sc.nextInt()-1;
         r2 = sc.nextInt()-1;
         c2 = sc.nextInt()-1;
         ans =0;
         grid = new int[n][n];
        // Please write your code here.
        System.out.println(bfs(r1,c1));
    }
    static int bfs(int x,int y){
        Queue<int[]> q = new LinkedList<>();
        boolean[][] visited = new boolean[n][n];
        visited[x][y]=true;
        q.add(new int[]{x,y});
        while(!q.isEmpty()){
            int size = q.size();
            for(int i = 0 ; i < size;i++){
                int[] cur = q.poll();
                int cx = cur[0];
                int cy = cur[1];
                if(cx==r2&&cy==c2) return ans;
                for(int d=0;d<8;d++){
                    int nx = cx+dx[d];
                    int ny = cy+dy[d];
                    if(!in(nx,ny))continue;
                    if(visited[nx][ny])continue;
                    visited[nx][ny]=true;
                    q.add(new int[]{nx,ny});
                }
            }
            ans++;
        }
        return -1;
    }
    static boolean in(int x,int y){
        return 0<=x&&x<n&&0<=y&&y<n;
    }
}