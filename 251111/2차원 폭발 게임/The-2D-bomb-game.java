import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         n = sc.nextInt();
         m = sc.nextInt();
         k = sc.nextInt();
        grid = new int[n][n];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                grid[i][j] = sc.nextInt();
        // Please write your code here.
        for(int i = 0 ; i<k;i++){
            bomb();
            drop();
            rotate();
            drop();
        }
        bomb();
        drop();
        int ans=0;
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                if(grid[i][j]>0)ans++;
        System.out.println(ans);
    }
    static int n,m,k;
    static int[][] grid;
    static void drop(){
        int[][] temp = new int[n][n];
        for(int j = 0 ; j<n;j++){
            int idx = n-1;
            for(int i=n-1;i>=0;i--){
                if(grid[i][j]!=0){
                    temp[idx--][j]=grid[i][j];
                }
            }
        }
        grid=temp;
    }
    static int endOfArray;
    static void bomb(){
        for(int j = 0 ;j<n;j++){
            while(true){
                boolean explode=false;
                int row=0;
                while(row<n){
                    if(grid[row][j]==0){
                        row++;continue;
                    }
                    int start = row;
                    int val = grid[row][j];
                    while(row<n&&grid[row][j]==val){
                        row++;
                    }
                    int end = row-1;
                    int len = end-start+1;
                    if(len>=m){
                        for(int r=end+1;r<n;r++){
                            grid[r-len][j]=grid[r][j];
                        }
                        for(int r=n-len;r<n;r++){
                            grid[r][j]=0;
                        }
                        explode=true;
                        break;

                    }
                }
                if(!explode)break;
            }
            
        }
    }
    static void rotate(){
        int[][] temp = new int[n][n];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                temp[i][j]=grid[n-j-1][i];
        

        for(int i = 0 ; i < n;i++){
            System.arraycopy(temp[i],0,grid[i],0,n);
        }

    }
}