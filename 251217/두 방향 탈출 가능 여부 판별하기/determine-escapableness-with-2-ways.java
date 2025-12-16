import java.util.Scanner;
public class Main {
    static int[] dx = {1,0};
    static int[] dy = {0,1};
    static int n,m;
    static int[][] grid;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         n = sc.nextInt();
         m = sc.nextInt();
         grid = new int[n][m];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < m; j++)
                grid[i][j] = sc.nextInt();
        visited = new boolean[n][m];
        dfs(0,0);
        // Please write your code here.
        System.out.println(0);
    }
    static boolean[][] visited;
    static void dfs(int x,int y){
        if(x==n-1&&y==m-1){
            System.out.println(1);
            System.exit(0);
        }
        for(int d=0;d<2;d++){
            int nx = x+dx[d];
            int ny = y+dy[d];
            if(in(nx,ny)&&!visited[nx][ny]&&grid[nx][ny]!=0){
                visited[nx][ny]=true;
                dfs(nx,ny);
            }
        }
        
    }
    static boolean in(int x,int y){
        return 0<=x&&x<n&&0<=y&&y<m;
    }
}