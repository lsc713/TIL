import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        grid = new int[n][m];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < m; j++)
                grid[i][j] = sc.nextInt();
        // Please write your code here.
        int sum=-1;
        for(int i = 0 ; i < n ; i ++){
            for(int j=0;j<m;j++){
                for(int k=i;k<n;k++){
                    for(int l=j;l<m;l++){
                        if(posRect(i,j,k,l)){
                            sum=Math.max(sum,(k-i+1)*(l-j+1));
                        }
                        
                    }
                }
            }
        }
        System.out.println(sum);
    }
    static int n,m;
    static int[][] grid;
    
    static boolean posRect(int i,int j,int k,int l){
        for(int x = i;x<=k;x++){
            for(int y=j;y<=l;y++){
                if(grid[x][y]<=0)return false;
            }
        }
        return true;
    }
}