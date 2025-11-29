import java.util.*;
public class Main {
    static int n,k,ans;
    static int[][] grid;
    static boolean[][] visited;
    static Deque<Pair> dq;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        k = sc.nextInt();
        ans=0;
        grid = new int[n][n];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                grid[i][j] = sc.nextInt();
        dq =new LinkedList<>();
        visited=new boolean[n][n];
        for(int i=0;i<k;i++){
            int r=sc.nextInt()-1;
            int c =sc.nextInt()-1;
            dq.add(new Pair(r,c));
            visited[r][c]=true;
            ans++;
        }
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
        return 0<=x&&x<n&&0<=y&&y<n;
    }
    static void bfs(){
        
        while(!dq.isEmpty()){
            Pair cur= dq.poll();
            
            for(int d=0;d<4;d++){
                int nx=cur.x+dx[d];
                int ny=cur.y+dy[d];
                if(in(nx,ny)){
                    if(!visited[nx][ny]&&grid[nx][ny]==0){
                        visited[nx][ny]=true;
                        ans++;
                        dq.add(new Pair(nx,ny));
                    }
                }
            }
        }

    }

}