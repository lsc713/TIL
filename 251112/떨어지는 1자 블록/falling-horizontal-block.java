import java.util.Scanner;
public class Main {
    static int n,m,k;
    static int[][] grid;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         n = sc.nextInt();
         m = sc.nextInt();
         k = sc.nextInt()-1;
         grid = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                grid[i][j] = sc.nextInt();
            }
        }

        int trow = findrow();
        for(int c=k;c<k+m;c++){
            grid[trow][c]=1;
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(grid[i][j]+" ");
            }
            System.out.println();
        }
        // Please write your code here.
    }
    static int findrow(){
        for(int row = 0 ; row < n-1 ; row++){
            for(int j=k;j<k+m;j++){
                if(is1exist(row+1,j)){
                    return row;
                }
            }
        }
        return n-1;
    }
    static boolean is1exist(int x,int y){
        if(grid[x][y]>0)return true;
        return false;
    }
}