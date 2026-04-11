import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] grid = new int[n][m];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < m; j++)
                grid[i][j] = sc.nextInt();
        // Please write your code here.
        int ans =0;
        int[][] dp = new int[n][m];
        dp[0][0]=1;
        for(int i = 0 ; i < n;i++){
            for(int j = 0 ; j < m ; j++){
                for(int k=0;k<i;k++){
                    for(int l=0;l<j;l++){
                        if(grid[i][j]>grid[k][l]&&dp[k][l]>0){
                            dp[i][j]=Math.max(dp[i][j],dp[k][l]+1);
                        }
                    }
                }
                ans=Math.max(ans,dp[i][j]);
            }
        }
        System.out.println(ans);
    }
}