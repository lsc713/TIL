import java.util.Scanner;
public class Main {
    static int getRow(int col){
        for(int row = 0;row<n;row++){
            if(grid[row][col]!=0){
                return row;
            }
        }
        return -1;
    }
    static boolean inbombrange(int x,int y,int cenx,int ceny,int bombrange){
        return (x==cenx||y==ceny)&&Math.abs(x-cenx)+Math.abs(y-ceny)<bombrange;
        
    }
    static void bomb(int cenX,int cenY){
        int[][] temp = new int[n][n];
        
        int bombrange = grid[cenX][cenY];
        for(int i = 0 ; i < n;i++){
            for(int j = 0 ; j < n;j++){
                if(inbombrange(i,j,cenX,cenY,bombrange)){
                    grid[i][j]=0;
                }
            }
        }
        for(int j = 0;j<n;j++){
            int nextRow = n-1;
            for(int i =n-1;i>=0;i--){
                if(grid[i][j]>0){
                    temp[nextRow--][j]=grid[i][j];
                }
            }
        }
        for(int i = 0 ; i < n;i++){
            System.arraycopy(temp[i],0,grid[i],0,n);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         n = sc.nextInt();
         m = sc.nextInt();
         grid = new int[n][n];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                grid[i][j] = sc.nextInt();
        while(m-->0){
            int bomcol = sc.nextInt()-1;
            int bombrow = getRow(bomcol);
            if(bombrow==-1)continue;
            bomb(bombrow,bomcol);
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
    
}