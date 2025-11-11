import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         n = sc.nextInt();
        int[][] grid = new int[n][n];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                grid[i][j] = sc.nextInt();
                
        // Please write your code here.
        int ans=0;
        for(int i=0;i<n;i++){
            for(int j = 0 ; j < n ; j++){
                int[][] gridMock = new int[n][n];
                for(int q = 0 ; q < n ; q++){
                    System.arraycopy(grid[q],0,gridMock[q],0,n);
                }
                int temp = calc(i,j,gridMock);
                ans=Math.max(ans,temp);
            }
        }
        
        System.out.println(ans);
    }
    static int[] dx ={-1,1,0,0};
    static int[] dy= {0,0,-1,1};
    static int calc(int x,int y,int[][] gridMock){
        gridMock = explod(x,y,gridMock);
        gridMock= drop(gridMock);
        return findEQ(gridMock);
    }
    static int findEQ(int[][] grid){
        int cnt=0;
        for(int i = 0 ; i < n ;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]==0)continue;
                for(int d=0;d<4;d++){
                    int nx = i+dx[d];
                    int ny = j+dy[d];
                    if(in(nx,ny)&&grid[nx][ny]==grid[i][j]){
                        cnt++;     
                    }
                }
                
            }
        }
        return cnt/2;
    }
    static int[][] drop(int[][] grid){
        int[][] temp = new int[n][n];
        for(int j =0;j<n;j++){
            int idx = n-1;
            for(int i =n-1;i>=0;i--){
                if(grid[i][j]!=0){
                    temp[idx--][j]=grid[i][j];
                }
            }
        }
        grid=temp;
        return grid;
    }
    static int n;
    static boolean in(int x,int y){
        return 0<=x&&x<n&&0<=y&&y<n;
    }
    static int[][] explod(int x,int y,int[][] grid){
        int explod = grid[x][y]-1;
        for(int d=0;d<4;d++){
            for(int q=1;q<=explod;q++){
                int nx = x+dx[d]*q;
                int ny = y+dy[d]*q;
                if(in(nx,ny)){
                    grid[nx][ny]=0;
                }
            }
        }
        grid[x][y]=0;
        return grid;
    }
}