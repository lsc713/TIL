import java.util.*;
public class Main {
    static int MOD = 1000000007;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        long[][][] dp = new long[n+1][3][3];
        dp[0][0][0]=1;

        for(int i = 1 ; i <=n;i++){
            for(int j = 0 ; j < 3;j++){
                for(int k = 0 ; k < 3;k++){
                    long best = 0;
                    if(k==0){
                        long temp = (dp[i-1][j][0]+dp[i-1][j][1]+dp[i-1][j][2]);
                        best+=temp;
                        if(j>=1){
                            temp = (dp[i-1][j-1][0]+dp[i-1][j-1][1]+dp[i-1][j-1][2]);
                            best+=temp;
                        }
                    }else{
                        best+=dp[i-1][j][k-1];
                    }
                    
                    dp[i][j][k]=best%MOD;
                }
            }
        }
        long ans =0;
        for(int j = 0 ; j < 3;j++){
            for(int k = 0 ; k < 3;k++){
                ans = (ans+dp[n][j][k]) % MOD; 
            }
        }
        System.out.println(ans);
        // Please write your code here.
    }
}