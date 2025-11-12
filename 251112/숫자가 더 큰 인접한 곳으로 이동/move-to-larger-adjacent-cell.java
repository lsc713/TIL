import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         n = sc.nextInt();
        int r = sc.nextInt();
        int c = sc.nextInt();
        int[][] grid = new int[n+1][n+1];
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                grid[i][j] = sc.nextInt();
            }
        }
        boolean flag=true;
        while(flag){
            System.out.print(grid[r][c]+" ");
            flag=false;
            int ref = grid[r][c];
            for(int d=0;d<4;d++){
                int nx = r+dx[d];
                int ny = c+dy[d];
                if(in(nx,ny)&&grid[nx][ny]>grid[r][c]){
                    flag=true;
                    r=nx;
                    c=ny;
                    break;
                }
            }
            
        }
        // Please write your code here.
    }
    static int n;
    static boolean in(int x,int y){
        return 0<x&&x<=n&&0<y&&y<=n;
    }
    static int[] dx = {-1,1,0,0};
    static int[] dy = {0,0,-1,1};
}