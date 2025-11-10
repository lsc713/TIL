import java.util.Scanner;

public class Main {
    static int[] dx = {-1,1,0,0};
    static int[] dy = {0,0,-1,1};
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int[][] grid = new int[n][n];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                grid[i][j] = sc.nextInt();
        int r = sc.nextInt()-1;
        int c = sc.nextInt()-1;
        //폭탄크기정하기
        for(int d = 0 ; d < 4;d++){
            for(int j =1;j<=grid[r][c]-1;j++){
                int nx = r+dx[d]*j;
                int ny = c+dy[d]*j;
                if(in(nx,ny)){
                    grid[nx][ny]=0;
                }
            }
        }
        grid[r][c]=0;

        //각 열을 돌면서 아래에서 부터 당겨주기.
        for(int j = 0 ; j < n ;j++){
            for(int i=n-1;i>=1;i--){
                if(grid[i][j]==0){
                    grid[i][j]=grid[i-1][j];
                    grid[i-1][j]=0;
                }
            }
        }
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                System.out.print(grid[i][j]+" ");
            }
            System.out.println();
        }
            
                
        // Please write your code here.
    }
    static int n;
    static boolean in(int nx,int ny){
        return 0<=nx&&0<=ny&&ny<n&&nx<n;
    }
}