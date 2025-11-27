import java.util.Scanner;
public class Main {

    static int[] dx = {-1,1,1,-1,0,0,-1,1};
    static int n,m;
    static int[][] grid,pos;
    static int[] dy = {-1,1,-1,1,1,-1,0,0};
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         n = sc.nextInt();
         m = sc.nextInt();
         grid = new int[n][n];
         pos = new int[n*n+1][2];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++){
                grid[i][j] = sc.nextInt();
                pos[grid[i][j]][0]=i;
                pos[grid[i][j]][1]=j;
            }
                

        for(int a = 0 ; a < m ; a++){
            for(int b=1;b<=n*n;b++){
                int i = pos[b][0];
                int j = pos[b][1];
                change(i,j);
            }
            
        }
        
        for(int i =0;i<n;i++){
            for(int j = 0 ;j<n;j++){
                System.out.print(grid[i][j]+" ");
            }
            System.out.println();
        }
        // Please write your code here.
    }
    static void change(int x,int y){
        int max =0;
        int tx=0;
        int ty=0;
        boolean flag=false;
        for(int d=0;d<8;d++){
            int nx = x+dx[d];
            int ny = y+dy[d];
            if(in(nx,ny)){
                if(max<grid[nx][ny]){
                    max=grid[nx][ny];
                    tx=nx;
                    ty=ny;
                    flag=true;
                }
            }
        }
        int temp = grid[x][y];
        grid[x][y]=grid[tx][ty];
        grid[tx][ty]=temp;

        pos[grid[tx][ty]][0]=tx;
        pos[grid[tx][ty]][1]=ty;
        pos[grid[x][y]][0]=x;
        pos[grid[x][y]][1]=y;
    }
    static boolean in(int x,int y){
        return 0<=x&&x<n&&0<=y&&y<n;
    }
}