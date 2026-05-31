import java.util.*;
public class Main {
    static int MOD = 1000000007;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] dp = new int[n+1][10];
        for(int i  =1;i<=9;i++){
            dp[1][i]=1;
        }
        for(int i=1;i<=n;i++){
            for(int j = 0 ; j <=9;j++){
                if(j==0){
                 dp[i][j]+=dp[i-1][j+1];   
                }else if(j==9){
                    dp[i][j]+=dp[i-1][j-1];
                }else{
                    dp[i][j]+=dp[i-1][j+1]+dp[i-1][j-1];
                }
                dp[i][j] %= MOD;
            }
        }
        long ans =0;
        for(int i = 0 ; i <=9;i++){
            ans =(ans+dp[n][i])%MOD;
        }
        /*
        길이가 n인 계단 수의 개수
        n=1
        1 2 3 4 5 6 7 8 9
        n=2
        12 23 34 45 56 67 89 90
        98 87 76 54 43 32 21


        */
        System.out.println(ans);
        // Please write your code here.
    }
}