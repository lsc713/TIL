import java.util.Scanner;
public class Main {
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

        //막대 집어넣기.
        for(int i=k;i<k+m;i++){
            grid[0][i]=1;
        }

        //drop
        drop();

        

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(grid[i][j]+ " ");
            }
            System.out.println();
        }
        // Please write your code here.
    }
    static int[][] grid;
    static int n,m,k;
    static void drop(){
        boolean movable=true;
        int row =0;
        while(movable){
            for(int i=1;i<n;i++){//행이 1이 있는지 확인하기
                for(int j=k;j<k+m;j++){
                    if(grid[i][j]==1){
                        movable=false;
                    }
                }
                if(movable){
                    for(int j=k;j<k+m;j++){
                        grid[i-1][j]=0;
                        grid[i][j]=1;
                    }
                }       
            }
        }
    }
}