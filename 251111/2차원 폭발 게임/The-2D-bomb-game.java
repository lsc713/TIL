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
            while(bomb()){
                drop();
            }
            rotate();
            drop();
        }
        while(bomb()){
            drop();
        }
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
    static boolean bomb(){
        boolean any = false;
        for(int j = 0 ;j<n;j++){
            int end = n;
            boolean again=true;
            while(again){
                again=false;
                int r= 0;
                while(r<end){
                    if(grid[r][j]==0){
                        r++;continue;
                    }
                    int r2=r+1;
                    while(r2<end&&grid[r2][j]==grid[r][j])r2++;
                    int len = r2-r;
                    if(len>=m){
                        for(int x = r2;x<n;x++){
                            grid[x-len][j]=grid[x][j];
                        }
                        for(int x= n-len;x<n;x++){
                            grid[x][j]=0;
                        }
                        end-=len;
                        again=true;
                        any=true;
                    }else{
                        r=r2;
                    }
                }
            }
        }
        return any;
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