import java.util.*;

public class Main {
    static int SENTINEL = -500001;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n+1];
        for (int i = 1; i <= n; i++) {
            arr[i] = sc.nextInt();
        }
        int[][][] dp = new int[n+1][m+1][2];
        for(int[][] values : dp){
            for(int[] row : values){
                Arrays.fill(row,SENTINEL);
            }
        }
        dp[0][0][0]=0;
        for(int i =1;i<=n;i++){
            for(int j = 0;j<=m;j++){
                int best =SENTINEL;
                if(dp[i-1][j][0]!=SENTINEL){
                    best=Math.max(best,dp[i-1][j][0]);
                }
                if(dp[i-1][j][1]!=SENTINEL){
                    best=Math.max(best,dp[i-1][j][1]);
                }
                dp[i][j][0]=best;

                best=SENTINEL;
                if(dp[i-1][j][1] != SENTINEL){
                    best=Math.max(best,dp[i-1][j][1]+arr[i]);
                }
                if(j>=1&&dp[i-1][j-1][0] != SENTINEL){
                    best=Math.max(best,dp[i-1][j-1][0]+arr[i]);
                }
                dp[i][j][1]=best;

            }
        }
        System.out.println(Math.max(dp[n][m][0],dp[n][m][1]));
        // Please write your code here.
    }
}