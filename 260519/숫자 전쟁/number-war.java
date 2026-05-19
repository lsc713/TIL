import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n+2];
        int[] b = new int[n+2];
        for (int i = 1; i <= n; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 1; i <= n; i++) {
            b[i] = sc.nextInt();
        }
        int[][] dp = new int[n+1][n+1];
        for(int[] row: dp) Arrays.fill(row,-1);
        dp[0][0]=0;
        for(int i = 0 ; i <= n ; i ++){
            for(int j = 0 ; j <= n ; j ++){
                if(i==0&&j==0)continue;
                int best = -1;
                if(i>=1 && j>=1 && dp[i-1][j-1]!=-1){
                    best = Math.max(best,dp[i-1][j-1]);
                }
                if(i>=1 && j+1 <=n && a[i] < b[j+1] && dp[i-1][j] != -1){
                    best = Math.max(dp[i-1][j],best);
                }
                if(j>=1 && i+1<=n && b[j]<a[i+1]&& dp[i][j-1] != -1){
                    best = Math.max(dp[i][j-1]+b[j],best);
                }
                dp[i][j]=best;

            }
        }

        int ans =0;
        for(int i=0;i<=n;i++){
            if(dp[i][n]!=-1)ans=Math.max(ans,dp[i][n]);
            
        }
        for(int i=0;i<=n;i++){
            if(dp[n][i]!=-1) ans=Math.max(ans,dp[n][i]);
        }
        System.out.println(ans);
        
        // Please write your code here.
    }
}