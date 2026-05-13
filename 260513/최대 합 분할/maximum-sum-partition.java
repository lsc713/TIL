import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n+1];
        int s=0;
        for(int i = 1; i <= n; i++){
            arr[i] = sc.nextInt();
            s+=arr[i];
        }
        int[][] dp = new int[n+1][2*s+1];
        for(int[] row:dp) Arrays.fill(row,-1);
        dp[0][s]=0;
        for(int i = 1 ; i <= n ; i++){
            int v = arr[i];
            for(int j=0;j<=2*s;j++){
                int best = -1;
                if(j-v>=0&&dp[i-1][j-v] != -1){
                    best = Math.max(best,dp[i-1][j-v]+v);
                }
                if(j+v<=2*s&&dp[i-1][j+v] != -1){
                    best = Math.max(best,dp[i-1][j+v]);
                }
                if(dp[i-1][j] != -1){
                    best = Math.max(best,dp[i-1][j]);
                }
                dp[i][j]=best;
            }
        }
        System.out.println(dp[n][s]);

        // Please write your code here.
    }
}