import java.util.*;
public class Main {
    static int n,m,ans;
    static int[][] grid;
    static boolean[][] visited;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        ans=0;
        grid = new int[n][m];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < m; j++)
                grid[i][j] = sc.nextInt();
                //일이 뱀이 없음
        bfs();
        // Please write your code here.
        System.out.println(ans);
    }
    static class Pair{
        int x,y;
        public Pair(int x, int y){
            this.x=x;
            this.y=y;
        }
    }
    static int[] dx = {0,0,-1,1};
    static int[] dy = {1,-1,0,0};
    static boolean in(int x,int y){
        return 0<=x&&x<n&&0<=y&&y<m;
    }
    static void bfs(){
        visited=new boolean[n][m];
        Deque<Pair> dq = new LinkedList<>();
        dq.add(new Pair(0,0));
        visited[0][0]=true;
        while(!dq.isEmpty()){
            Pair cur= dq.poll();
            if(cur.x==n-1&&cur.y==m-1){
                ans=1;break;
            }
            for(int d=0;d<4;d++){
                int nx=cur.x+dx[d];
                int ny=cur.y+dy[d];
                if(in(nx,ny)){
                    if(!visited[nx][ny]&&grid[nx][ny]==1){
                        visited[nx][ny]=true;
                        dq.add(new Pair(nx,ny));
                    }
                }
            }
        }

    }

}