import java.util.*;

public class Main {
    static final long MOD = 1_000_000_007;

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        long[][] dp = new long[n+1][4];

        dp[0][0] = 1;

        for(int i=0; i<n; i++){
            // mask = 0
            dp[i+1][0] = (dp[i+1][0] + dp[i][0] * 2) % MOD;
            dp[i+1][1] = (dp[i+1][1] + dp[i][0]) % MOD;
            dp[i+1][2] = (dp[i+1][2] + dp[i][0]) % MOD;
            dp[i+1][3] = (dp[i+1][3] + dp[i][0]) % MOD;

            // mask = 1
            if(i+1 <= n){
                dp[i+1][0] = (dp[i+1][0] + dp[i][1]) % MOD;
                dp[i+1][2] = (dp[i+1][2] + dp[i][1]) % MOD;
            }

            // mask = 2
            if(i+1 <= n){
                dp[i+1][0] = (dp[i+1][0] + dp[i][2]) % MOD;
                dp[i+1][1] = (dp[i+1][1] + dp[i][2]) % MOD;
            }

            // mask = 3
            if(i+1 <= n){
                dp[i+1][0] = (dp[i+1][0] + dp[i][3]) % MOD;
            }
        }

        System.out.println(dp[n][0] % MOD);
    }
}