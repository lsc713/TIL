import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         n = sc.nextInt();
         m = sc.nextInt();
         grid = new int[n][n];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                grid[i][j] = sc.nextInt();
        int[] bombCols = new int[m];
        for (int i = 0; i < m; i++){
            bombCols[i] = sc.nextInt()-1;
            //열의 0이아닌 첫번째를 확인해서 터뜨리고, 조정하기.
            for(int j = 0;j<n;j++){
                if(grid[j][bombCols[i]]!=0){
                    bomb(j,bombCols[i]);
                    adjust();

                }
            }
        }
        for(int i = 0 ; i < n ;i++){
            for(int j = 0 ; j < n ;j++){
                System.out.print(grid[i][j]+" ");
            }
            System.out.println();
        }
    }
    static int[][] grid;
    static int n,m;
    static int[] dx = {-1,1,0,0};
    static int[] dy = {0,0,1,-1};
    static void adjust(){
        
        for(int j = 0 ; j <n;j++){
            int i =n-1;
            while(i>0){
                int idx = i-1;
                if(idx>=0&&grid[i][j]==0){
                    if(grid[idx][j]!=0){
                        grid[i][j]=grid[idx][j];
                        grid[idx][j]=0;
                    }else{
                        idx--;
                    }
                }
                i=idx;
            }
        }
        
    }
    static void bomb(int x,int y){
        int[][] temp = new int[n][n];
        for(int i = 0 ; i < n;i++){
            System.arraycopy(grid[i],0,temp[i],0,n);
        }
        int repeat = grid[x][y]-1;
        for(int d=0;d<4;d++){
            for(int q=1;q<=repeat;q++){
                int nx = x+dx[d]*q;
                int ny = y+dy[d]*q;
                if(in(nx,ny)){
                    temp[nx][ny]=0;
                }
            }
            
        }
        temp[x][y]=0;
        for(int i = 0 ; i < n;i++){
            System.arraycopy(temp[i],0,grid[i],0,n);
        }
    }
    static boolean in(int x,int y){
        return 0<=x&&x<n&&0<=y&&y<n;
    }
}