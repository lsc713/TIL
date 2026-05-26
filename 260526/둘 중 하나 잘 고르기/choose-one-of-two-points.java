import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] reds = new int[2*n+1];
        int[] blues = new int[2*n+1];
        for (int i = 1; i <= 2 * n; i++) {
            reds[i] = sc.nextInt();
            blues[i] = sc.nextInt();
        }
        int ans =0;
        int[][] dp = new int[2*n+1][n+1];
        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }
        dp[0][0]=0;
        for (int i = 0; i <= 2 * n; i++) {
            for(int j = 0; j<= n ; j ++){
                if(i==0&&j==0)continue;
                int best = -1;
                if(j>=1&&i>=1&&dp[i-1][j-1]!=-1&&j!=0){
                    best = Math.max(best,dp[i-1][j-1]+reds[i]);
                }
                if(i>=1 && dp[i-1][j]!=-1){
                    best =Math.max(best,dp[i-1][j]+blues[i]);
                }
                dp[i][j]=best;
            }
        }
        System.out.println(dp[2*n][n]);
        // Please write your code here.
    }
}