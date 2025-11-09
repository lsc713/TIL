import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         n = sc.nextInt();
        grid = new int[n][n];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                grid[i][j] = sc.nextInt();
        int r = sc.nextInt()-1;
        int c = sc.nextInt()-1;
        int m1 = sc.nextInt();
        int m2 = sc.nextInt();
        int m3 = sc.nextInt();
        int m4 = sc.nextInt();
        int dir = sc.nextInt();//0반시계 1 시계
        shift(r,c,m1,m2,dir);
        
        for(int i = 0 ; i < n ; i++){
            for(int j =0;j<n;j++){
                System.out.print(grid[i][j]+" ");
            }
            System.out.println();
        }
        
        // Please write your code here.
    }
    static int n;
    static int[][] grid;
    static void shift(int x,int y ,int k,int l ,int dr){
        int[] dx,dy,moveNums;
        if(dr == 0){
            dx = new int[]{-1,-1,1,1};
            dy = new int[]{1,-1,-1,1};
            moveNums = new int[]{k,l,k,l};
        }else {
            dx = new int[]{-1,-1,1,1};
            dy = new int[]{-1,1,1,-1};
            moveNums = new int[]{l,k,l,k};
        }
        int[][] tmp = new int[n][n];
        for(int i = 0 ; i < n ;i++){
            System.arraycopy(grid[i],0,tmp[i],0,n);
        }
        for(int d=0;d<4;d++){
            for(int q=0;q<moveNums[d];q++){
                int nx = x+dx[d];
                int ny = y+dy[d];
                tmp[nx][ny]=grid[x][y];
                x=nx;y=ny;
            }
        }
        for(int i = 0 ; i < n ;i++){
            System.arraycopy(tmp[i],0,grid[i],0,n);
        }
    }
}