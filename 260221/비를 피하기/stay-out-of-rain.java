import java.util.*;
public class Main {
    static int[] dx = {-1,1,0,0};
    static int[] dy = {0,0,1,-1};
    static int n,h,m;
    static int[][] a,ans;
    static boolean in(int x,int y){
        return 0<=x&&x<n&&0<=y&&y<n;
    }
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        h = sc.nextInt();
        m = sc.nextInt();
        a=new int[n][n];ans=new int[n][n];
        for(int i = 0 ; i <n;i++){
            for(int j =0;j<n;j++){
                a[i][j]=sc.nextInt();
                ans[i][j]=-1;
            }
        }
        bfs();
        for(int i = 0 ; i <n;i++){
            for(int j =0;j<n;j++){
                if(a[i][j]==2){
                    System.out.print(ans[i][j]+" ");
                }else{
                    System.out.print(0+" ");
                }
            }
            System.out.println();
        }



    }
    static void bfs(){
        Queue<int[]> q = new LinkedList<>();
        boolean[][] visited = new boolean[n][n];
        for(int i = 0 ; i <n;i++){
            for(int j =0;j<n;j++){
                if(a[i][j]==3){
                    ans[i][j]=0;
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
                if(a[nx][ny]==1)continue;
                if(visited[nx][ny])continue;
                ans[nx][ny]=ans[x][y]+1;
                visited[nx][ny]=true;
                q.add(new int[]{nx,ny});
            }
        }
    }
}